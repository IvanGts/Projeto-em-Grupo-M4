import Card from 'react-bootstrap/Card';
import './CardsF.css'

function CardsFilme() {
  return (
    <Card class="container text-center">
      <Card.Img variant="top" src="https://cdn.ome.lt/9_sC4tyWRmMNxyNvC8wg-30jXzw=/837x0/smart/uploads/conteudo/fotos/Lista-03_XpwI7bI.jpg" />
      <Card.Body>
        <Card.Title>Star Wars-Uma nova esperança</Card.Title>
      </Card.Body>
    </Card>
  )
}

export default CardsFilme;