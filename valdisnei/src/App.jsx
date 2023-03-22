import './App.css'
import { BrowserRouter as Router, Routes, Route} from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header/Header';
import { Inicio, InicioLogged } from './pages/Inicio/Inicio';
import Login from './pages/Login/Login'
import Cadastro from "./pages/Cadastro/Cadastro";
import Filmes from './pages/Filmes/Filmes'
import Footer from './components/Footer/Footer';
import PerfilUsuario from './pages/PerfilUsuario/PerfilUsuario';
import {PerfilMusico, PerfilAtor} from './pages/PerfilArtista/PerfilArtista'
import './services/login'
import { useEffect, useState } from 'react';
import { lightTheme, darkTheme } from './services/themes';

const testeIsLogado = localStorage.getItem('logado')=='true';
function App() {
  const [isDark, setIsDark] = useState(true);

  const [isLogado, setIsLogado] = useState(false);
  useEffect(() => setIsLogado(testeIsLogado?true:false),[])

  function handleOnChange() {
    console.log('abri')
          setIsDark(!isDark);
          if (isDark) {
            console.log('is dark');
            darkTheme;
          } else {
            console.log('is light');
            lightTheme;
          }
  }

  return (
    <div className="App">
      <Router>
        <input type="checkbox" name="ativeDark" id="ativeDark" checked={false} style={{display: 'none'}}
        onChange={ handleOnChange } />
        <Header estaLogado={isLogado} neutro={false} />
        <Routes>
          <Route path="/" element={testeIsLogado?<InicioLogged/>:<Inicio/>}/>
          <Route path='/login' element={<Login/>}/>
          <Route path='/cadastro' element={<Cadastro/>} />
          <Route path='/filmes' element={<Filmes/>} />
          <Route path='/perfil' element={<PerfilUsuario NomeUsuario={"Alguem"}/>}/>
          <Route path='/pArtista' element={<PerfilAtor/>} />
        </Routes>
        <Footer/>
      </Router>
    </div>
  )
}

export default App
