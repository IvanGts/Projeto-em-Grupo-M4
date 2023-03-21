import './App.css'
import {BrowserRouter as Router, Routes, Route} from "react-router-dom"
import CardsMusica from './components/CardsMusica/CardsMusica'
import CardsFilme from './components/CardsFilme/CardsFilme'
import NomeMusica from './components/NomeMusica/NomeMusica'

function App() {

  return (
    <div className="App">
      <Router>
        <CardsMusica/>
        <CardsFilme/>
        <NomeMusica/>
      </Router>
    </div>
  )
}

export default App
