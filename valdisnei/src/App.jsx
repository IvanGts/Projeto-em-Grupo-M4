import './App.css'
import {BrowserRouter as Router, Routes, Route} from "react-router-dom"
import CardsMusica from './components/CardsMusica/CardsMusica'
import CardsFilme from './components/CardsFilme/CardsFilme'
import NomeMusica from './components/NomeMusica/NomeMusica'
import Footer from './components/Footer/Footer'

function App() {

  return (
    <div className="App">
      <Router>
        <CardsMusica/>
        <CardsFilme/>
        <NomeMusica/>
        <Footer/>
      </Router>
    </div>
  )
}

export default App
