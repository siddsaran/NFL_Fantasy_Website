import {Link} from "react-router-dom";
import {useState} from "react";

const Search = () => {
    const [searchQuery, setSearchQuery] = useState('')
    return(
        <>
            <text>Search:</text>
            <div className='search-bar'>
                <input
                    type="text"
                    placeholder="Search for players"
                    value={searchQuery}
                    onChange={e => setSearchQuery(e.target.value)}
                />
            </div>

            <Link to={`/data?name=${searchQuery}`}>
                <button className='cta-button'>Search!</button>
            </Link>
        </>
    )
}

export default Search