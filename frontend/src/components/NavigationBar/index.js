import { Link, NavLink} from "react-router-dom";
import {useState} from "react";
import './index.scss'

const NavigationBar = () => {
    const [showNav, setShowNav] = useState(false);
    return (
        <div className = "navbar">
            <Link className = "navbar-brand" to="/">
                NFL Fantasy!
            </Link>
            <nav className={`nav-links ${showNav ? 'show' : ''}`}>
                <NavLink to="/" className="nav-link" activeclassname="active">Home</NavLink>
                <NavLink to="/teams" className="nav-link" activeclassname="active">Team</NavLink>
                <NavLink to="/positions" className="nav-link" activeclassname="active">Position</NavLink>
                <NavLink to="/search" className="nav-link" activeclassname="active">Search</NavLink>
            </nav>
        </div>

    )
}

export default NavigationBar