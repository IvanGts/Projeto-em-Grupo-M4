import React, { useState, useRef } from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import logo from '../../assets/logo/logo.png';
import login_box_fill from '../../assets/vectors/login-box-fill.svg';
import user_profile from '../../assets/vectors/ui-user-profile.svg';
import ToggleButton from "../ToggleButton/ToggleButton";
import {OpcoesUsuario, OverlayModal} from "../OpcoesUsuario/OpcoesUsuario";
import "./NavBar.css"

function reduzirNavBar() {
  if (document.body.scrollTop > 66 || document.documentElement.scrollTop > 66) {
      document.querySelector('.container').style = 'max-width: 70%'
      // document.querySelector('.navbar').style = 'background-color: rgba(114, 131, 144, 0)'
  }
  else {
      document.querySelector('.container').style = 'max-width: 1500px'
      // document.querySelector('.navbar').style = 'background-color: var(--elementos_neutros_escuro)'
  }
}
window.onscroll = function() { reduzirNavBar() };

export function NavBarDefault() {

  return (
    <Navbar expand="md" fixed='top'>
      <Container className='mx-1'>
        <Navbar.Brand href="/" className='mx-5'><img src={logo} alt="Valdisnei" /></Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="justify-content-around w-100 mx-3">
            <Nav.Link href="#home">Música</Nav.Link>
            <Nav.Link href="#link">Filmes</Nav.Link>
          </Nav>
          <Nav className="justify-content-around mx-3 w-100 itens-direita">
            <Nav.Link href="/cadastro" className='small'>CADASTRE-SE</Nav.Link>
            <Nav.Link href="/login" className='d-flex align-items-center'><img src={login_box_fill} alt="Login" className='m-0 h-100'/> Login</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default NavBarDefault;

export function NavBarNeutra() {
  return (
    <Navbar expand="md" fixed='top'>
      <Container className='m-auto'>
        <Navbar.Brand href="#" className='mx-auto'><img src={logo} alt="Valdisnei" /></Navbar.Brand>
        <span className='me-1 small'>Modo Escuro: </span>
        <ToggleButton/>
      </Container>
    </Navbar>
  )
}

export function NavBarLogado() {
  const [show, setShow] = useState(false);
  const target = useRef(null);

  return (
    <Navbar expand="md" fixed='top'>
      <Container className='mx-1'>
        <Navbar.Brand href="#" className='mx-5'><img src={logo} alt="Valdisnei" /></Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="justify-content-around w-100 mx-3">
            <Nav.Link href="#home">Música</Nav.Link>
            <Nav.Link href="#link">Filmes</Nav.Link>
            <Nav.Link href="#link">Minha Biblioteca</Nav.Link>
          </Nav>
          <Nav className="justify-content-around mx-3 w-100 itens-direita">
            <Nav.Link href="" className='d-flex align-items-center' ref={target} onClick={() => setShow(!show)}><img src={user_profile} alt="Login" className='m-0 h-100 profile'/></Nav.Link>
            {/* Para o caso da tela ser menor */}
            <OpcoesUsuario className="optResponsivo"/>
          </Nav>
        </Navbar.Collapse>
      </Container>
      <OverlayModal show={show} setTarget={target} /> 
    </Navbar>
  );
}