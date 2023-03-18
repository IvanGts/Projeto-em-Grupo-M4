import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';
import logo from '../../assets/logo/logo.png';
import "./NavBar.css"
import ToggleButton from "../ToggleButton/ToggleButton";

export default function NavBarNeutra() {
    return (
      <Navbar expand="lg" fixed='top'>
        <Container className='m-auto'>
          <Navbar.Brand href="#" className='mx-auto'><img src={logo} alt="Valdisnei" /></Navbar.Brand>
          <span className='me-1 small'>Modo Escuro: </span>
          <ToggleButton/>
        </Container>
      </Navbar>
    )
  }