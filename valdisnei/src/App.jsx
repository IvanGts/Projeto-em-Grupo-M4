import './App.css'
import { BrowserRouter as Router, Routes, Route} from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header/Header';
import Inicio from './pages/Inicio/Inicio';
import Login from './pages/Login/Login'
import Cadastro from "./pages/Cadastro/Cadastro";
import Filmes from './pages/Filmes/Filmes'
import Footer from './components/Footer/Footer';

function App() {

  return (
    <div className="App">
      <Router>
        <Header estaLogado={true} neutro={false} />
        <Routes>
          <Route path="/" element={<Inicio/>}/>
          <Route path='/login' element={<Login/>}/>
          <Route path='/cadastro' element={<Cadastro/>} />
          <Route path='/filmes' element={<Filmes/>} />
        </Routes>
        <Footer/>
      </Router>
    </div>
  )
}

export default App
