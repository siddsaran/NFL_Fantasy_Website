import React from "react";
import { Link } from "react-router-dom";
import './index.scss';
import logo from '../../assets/logo.jpeg';  // Adjust path as needed

const Home = () => {
    return (
        <div className="home-container">
            <img src={logo} alt="NFL Fantasy Logo" className="nfl-logo" />
            <p className="subtitle">Check player stats and dominate your fantasy league this season.</p>
            <Link to="/teams">
                <button className="cta-button">Get Started ➜</button>
            </Link>
        </div>
    );
};

export default Home;
