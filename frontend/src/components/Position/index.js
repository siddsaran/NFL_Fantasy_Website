import { Link } from "react-router-dom";
import positionData from "../../data/positions.json";
import React, {useEffect, useState } from "react";
import './index.scss'

const Position = () => {
    const [searchQuery, setSearchQuery] = useState('');
    const [filteredPositions, setFilteredPositions] = useState(positionData.positions);

    useEffect(() => {
        const filtered = positionData.positions.filter(pos =>
            pos.title.toLowerCase().includes(searchQuery.toLowerCase())
        );
        setFilteredPositions(filtered)
    }, [searchQuery]);

    const renderPositions = (positions) => {
        return positions.map((pos, index) => (
            <div className="position-card" key={index}>
                <Link to={`/data?position=${pos.search}`}>
                    <img src={pos.image} alt={pos.title} className="position-image" />
                </Link>
                <div className="position-title">{pos.title}</div>
            </div>
        ))
    }


    return (
        <>
            <text className='position-text'>Positions:</text>
            <div className='search-bar'>
                <input
                    type="text"
                    placeholder="Search for Position"
                    value={searchQuery}
                    onChange={e => setSearchQuery(e.target.value)}
                />
            </div>
            <div className='positions-grid'>{renderPositions(filteredPositions)}</div>
        </>
    )
}

export default Position