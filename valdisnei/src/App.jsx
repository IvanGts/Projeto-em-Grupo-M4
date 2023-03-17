import './App.css'
import { BrowserRouter as Router, Routes, Route} from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header/Header'
import Carrossel from './components/Carrossel/Carrossel'

function App() {

  return (
    <div className="App">
      <Router>
        <Header />
        <div className="carrossel">
          <Carrossel></Carrossel>
        </div>
      </Router>
    </div>
  )
}

export default App
