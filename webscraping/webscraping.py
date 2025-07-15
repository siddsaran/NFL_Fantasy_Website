from bs4 import BeautifulSoup
import pandas as pd
import time
import requests
from io import StringIO
import re

NO_RENAME_COLS = ["Player", "Age", "Pos", "G", "GS", "Team"]

url = "https://www.pro-football-reference.com/years/2024/"
data = requests.get(url)
soup = BeautifulSoup(data.text, "html.parser")

# On the website, the AFC and NFC standings are in separate categories
# in the HTML part, so we need to go through 2 different lists
afc_standings = soup.select('table.sortable')[0]
nfc_standings = soup.select('table.sortable')[1]
afc_links = afc_standings.find_all('a')
nfc_links = nfc_standings.find_all('a')

# Gather all the links of each team
links = []
for l in afc_links:
    links.append(l.get("href"))
for l in nfc_links:
    links.append(l.get("href"))
team_urls = [f"https://pro-football-reference.com{l}" for l in links]

player_list = []
for team_url in team_urls:

    data = requests.get(team_url)
    soup = BeautifulSoup(data.text, "html.parser")

    # Get Team Name
    h1 = soup.find('h1')
    span = h1.find_all('span')
    team = span[1].text

    # Passing
    df = pd.read_html(data.text, match="Passing")[1]
    df["Team"] = team
    df = df.drop(columns=["QBrec", "Rk", "Awards"])
    df.columns = [f"P_{col}" if col not in NO_RENAME_COLS else col for col in df.columns]
    df = df.iloc[:-1]
    player_list.append(df)

    # Rushing & Recieving
    df = pd.read_html(data.text, match="Rushing & Receiving")[0]
    df.columns = [
        f"Rush_{col[1]}" if col[0] == 'Rushing'
        else f"Rec_{col[1]}" if col[0] == 'Receiving'
        else col[1]
        for col in df.columns
    ]
    df = df.drop(columns=["Rk", "Awards"])

    df["Team"] = team
    df = df.iloc[:-1]
    player_list.append(df)

    # Kicking
    pattern = r'<div id="all_kicking"[\s\S]*?<!--([\s\S]*?)-->'
    match = re.search(pattern, data.text)
    kicking_html = match.group(1)
    tables = pd.read_html(StringIO(kicking_html))
    df = tables[0]
    df.columns = [
        f"{col[0]}_{col[1]}" if '-' in col[0]
        else f"{col[0]}_{col[1]}" if '+' in col[0]
        else col[1]
        for col in df.columns
    ]
    df = df.drop(columns=["Rk", "Awards"])
    df["Team"] = team
    df = df.iloc[:-1]
    player_list.append(df)
    print(team)
    time.sleep(10)


all_player_teams = pd.concat(player_list)
numeric_cols = list(all_player_teams.select_dtypes(include='number').columns)
numeric_cols.remove('Age')
numeric_cols.remove('G')
numeric_cols.remove('GS')
non_numeric_cols = ['Player', 'Age', 'Pos', 'Team', 'G', 'GS']

# Group by Player and aggregate
df_combined = all_player_teams.groupby('Player', as_index=False).agg(
    {col: 'first' for col in non_numeric_cols if col != 'Player'}  # keep first value for non-numeric fields
    | {col: 'sum' for col in numeric_cols}                         # sum numeric stats
)

df_combined = df_combined.sort_values(by='Player').reset_index(drop=True)
df_combined.to_csv("player_data.csv")


