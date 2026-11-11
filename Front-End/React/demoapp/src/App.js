// import logo from './logo.svg';
// import './App.css';
// import UseStateEX from './Components/UseStateEx';
// import { Navbar } from 'react-bootstrap';

import './App.css';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Footer from './Components/Footer';
import MusicPlayer from './Components/MusicPlayer';
import ToDoList from './Components/ToDoList';
import Navbar from './Components/Navbar';
import Home from './Components/Home';
// import UseStateEX from './Components/UseStateEx';

// function App() {
// return (
//   <div className="App">
//     <header className="App-header">
//       <img src={logo} className="App-logo" alt="logo" />
//       <p>
//         Edit <code>src/App.js</code> and save to reload.
//       </p>
//       <a
//         className="App-link"
//         href="https://reactjs.org"
//         target="_blank"
//         rel="noopener noreferrer"
//       >
//         Learn React
//       </a>
//     </header>
//     <UseStateEX/>
//   </div>
// );

function App() {
  return (
    <BrowserRouter>
      <nav>
        <Link to="/">App</Link>
        <Link to="/Navbar">Navbar</Link>
        <Link to="/Footer">Footer</Link>
      </nav>

      <Routes>
        <Route path = "/" element = {<App />}>
        <Route path=":Home" element={<Home />} />
        <Route path=":Navbar" element={<Navbar />} />
        <Route path=":Footer" element={<Footer />} />
        <Route path=":Musicplayer" element={<MusicPlayer />} />
        <Route path=":ToDoList" element={<ToDoList />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
