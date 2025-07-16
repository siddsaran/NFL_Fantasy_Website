import React, {useState, useEffect } from "react";
import './index.scss'

const ShowData = () => {
    const [playerData, setPlayerData] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const teamParam = params.get('team');
        const positionParam = params.get('position');
        const nameParam = params.get('name');
        if (teamParam && positionParam) {
            fetch(`http://localhost:8080/api/v1/player?team=${teamParam}&position=${positionParam}`)
                .then(res => res.json())
                .then(data => {
                    setPlayerData(data);
                })
                .catch(error => {
                    console.log('Error fetching data')
                })
        } else if (teamParam) {
            fetch(`http://localhost:8080/api/v1/player?team=${teamParam}`)
                .then(res => res.json())
                .then(data => {
                    setPlayerData(data);
                })
                .catch(error => {
                    console.log('Error fetching data')
                })
        } else if (positionParam) {
            fetch(`http://localhost:8080/api/v1/player?position=${positionParam}`)
                .then(res => res.json())
                .then(data => {
                    setPlayerData(data);
                })
                .catch(error => {
                    console.log('Error fetching data')
                })
        } else if (nameParam) {
            fetch(`http://localhost:8080/api/v1/player?name=${nameParam}`)
                .then(res => res.json())
                .then(data => {
                    setPlayerData(data);
                })
                .catch(error => {
                    console.log('Error fetching data')
                })
        } else {
            fetch(`http://localhost:8080/api/v1/player`)
                .then(res => res.json())
                .then(data => {
                    setPlayerData(data);
                })
                .catch(error => {
                    console.log('Error fetching data')
                })
        }
        setLoading(false)
    }, []);

    if (loading) {
        return (
            <text>Loading User Data...</text>
        )
    }

    console.log("playerData:", playerData);

    return(
        <>
            <h1>Player Data:</h1>
            <table>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Position</th>
                    <th>Team</th>
                    <th>Games Played</th>
                    <th>Games Started</th>
                    <th>Pass Completions</th>
                    <th>Pass Attempts</th>
                    <th>Pass Completion %</th>
                    <th>Pass Yards</th>
                    <th>Pass Yards/Attempt</th>
                    <th>Pass TD</th>
                    <th>Interceptions Thrown</th>
                    <th>QBR</th>
                    <th>Sacks Taken</th>
                    <th>Rush Attempts</th>
                    <th>Rush Yards</th>
                    <th>Rush TD</th>
                    <th>Rush Yards/Attempt</th>
                    <th>Targets</th>
                    <th>Receptions</th>
                    <th>Receiving Yards</th>
                    <th>Receiving Yards/Rec</th>
                    <th>Receiving TD</th>
                    <th>Fumbles</th>
                    <th>FGA 0-19</th>
                    <th>FGM 0-19</th>
                    <th>FGA 20-29</th>
                    <th>FGM 20-29</th>
                    <th>FGA 30-39</th>
                    <th>FGM 30-39</th>
                    <th>FGA 40-49</th>
                    <th>FGM 40-49</th>
                    <th>FGA 50+</th>
                    <th>FGM 50+</th>
                    <th>FGA Total</th>
                    <th>FGM Total</th>
                    <th>XPA Total</th>
                    <th>XPM Total</th>
                </tr>
                </thead>
                <tbody>
                {playerData.slice(0, playerData.length).map(player => (
                    <tr key={player.name}>
                        <td>{player.name}</td>
                        <td>{player.age}</td>
                        <td>{player.position}</td>
                        <td>{player.team}</td>
                        <td>{player.gamesPlayed}</td>
                        <td>{player.gamesStarted}</td>
                        <td>{player.passCompletions}</td>
                        <td>{player.passAttempts}</td>
                        <td>{player.passCompletionPercentage}</td>
                        <td>{player.passYards}</td>
                        <td>{player.passYardsPerAttempt}</td>
                        <td>{player.passTouchdowns}</td>
                        <td>{player.interceptionsThrown}</td>
                        <td>{player.qbr}</td>
                        <td>{player.sacksTaken}</td>
                        <td>{player.rushAttempts}</td>
                        <td>{player.rushYards}</td>
                        <td>{player.rushTouchdowns}</td>
                        <td>{player.rushYardsPerAttempt}</td>
                        <td>{player.targets}</td>
                        <td>{player.receptions}</td>
                        <td>{player.receivingYards}</td>
                        <td>{player.receivingYardsPerAttempt}</td>
                        <td>{player.receivingTouchdowns}</td>
                        <td>{player.fumbles}</td>
                        <td>{player.fga_0_19}</td>
                        <td>{player.fgm_0_19}</td>
                        <td>{player.fga_20_29}</td>
                        <td>{player.fgm_20_29}</td>
                        <td>{player.fga_30_39}</td>
                        <td>{player.fgm_30_39}</td>
                        <td>{player.fga_40_49}</td>
                        <td>{player.fgm_40_49}</td>
                        <td>{player.fga_50_plus}</td>
                        <td>{player.fgm_50_plus}</td>
                        <td>{player.fga}</td>
                        <td>{player.fgm}</td>
                        <td>{player.xpa}</td>
                        <td>{player.xpm}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    )
}

export default ShowData