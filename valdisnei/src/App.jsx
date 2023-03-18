import './App.css'
import { BrowserRouter as Router, Routes, Route} from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header/Header';
import ButtonV from "./components/Button/ButtonValdisnei";
import Inicio from './pages/Inicio';

function App() {

  return (
    <div className="App">
      <Router>
        <Header />
        <Routes>
          <Route path="/" element={<Inicio/>}/>
        </Routes>
        
      </Router>
    </div>
  )
}

export default App
