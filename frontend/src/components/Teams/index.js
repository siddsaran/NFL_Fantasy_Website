import './index.scss'
import teamData from '../../data/teams.json'
import React, {useEffect, useState } from "react";
import {Link} from "react-router-dom";
import {render} from "@testing-library/react";

const Teams = () => {
    const [filteredTeams, setFilteredTeams] = useState(teamData.teams)
    const [searchQuery, setSearchQuery] = useState('')

    useEffect(() => {
        const filtered = teamData.teams.filter(team =>
            team.title.toLowerCase().includes(searchQuery.toLowerCase())
        );
        setFilteredTeams(filtered)
    }, [searchQuery]);

    const renderTeams = (teams) => {
        return teams.map((team, index) => (
            <div className="team-card" key={index}>
                <Link to={`/data?team=${team.search}`}>
                    <img src={team.image} alt={team.title} className='team-image'/>
                </Link>
                <div className="team-title">{team.title}</div>
            </div>
        ))
    }
    return (
        <>
            <text>Teams: </text>
            <div className = 'search-bar'>
                <input
                    type="text"
                    placeholder="Search for Team"
                    value={searchQuery}
                    onChange={e => setSearchQuery(e.target.value)}
                />
            </div>
            <div className='teams-grid'>{renderTeams(filteredTeams)}</div>
        </>
    )
}

export default Teams