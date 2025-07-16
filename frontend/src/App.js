import React, {useEffect} from "react";
import logo from './logo.svg';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
import Home from './components/Home'
import Layout from "./components/Layout";
import Position from "./components/Position";
import Teams from "./components/Teams";
import Search from "./components/Search"
import ShowData from "./components/ShowData";

function App() {
  useEffect(() => {
    document.title = 'NFL Fantasy';
  }, []);
  return (
    <>
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Layout />}>
                <Route index element={<Home />} />
                <Route path="positions" element={<Position />} />
                <Route path="teams" element={<Teams />} />
                <Route path="search" element={<Search />} />
                <Route path="data" element={<ShowData />} />
            </Route>
          </Routes>
        </BrowserRouter>
    </>
  );
}

export default App;
