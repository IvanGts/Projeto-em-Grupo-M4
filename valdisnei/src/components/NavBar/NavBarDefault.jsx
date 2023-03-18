import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import logo from '../../assets/logo/logo.png';
import login_box_fill from '../../assets/vectors/login-box-fill.svg';
import "./NavBar.css"

function NavBarDefault() {
  return (
    <Navbar expand="lg" fixed='top'>
      <Container className='mx-1'>
        <Navbar.Brand href="#home" className='mx-5'><img src={logo} alt="Valdisnei" /></Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="justify-content-around w-100 mx-3">
            <Nav.Link href="#home">Música</Nav.Link>
            <Nav.Link href="#link">Filmes</Nav.Link>
          </Nav>
          <Nav className="justify-content-around mx-3 w-100 itens-direita">
            <Nav.Link href="#home" className='small'>CADASTRE-SE</Nav.Link>
            <Nav.Link href="#link" className='d-flex align-items-center'><img src={login_box_fill} alt="Login" className='m-0 h-100'/> Login</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}


export default NavBarDefault;