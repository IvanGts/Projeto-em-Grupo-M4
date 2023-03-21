import Card from 'react-bootstrap/Card';
import './CardsM.css'

function CardsMusica() {
  return (
    <Card class="container text-center">
      <Card.Img variant="top" src="https://cdn.shopify.com/s/files/1/0522/1610/3083/articles/MILEY_CYRUS_FLOWERS_180x.png?v=1674751436" />
      <Card.Body>
        <Card.Title>Flowers</Card.Title>
        <Card.Text> Miley Cirus</Card.Text>
        <Card.Text> Flowers</Card.Text>
      </Card.Body>
    </Card>
  )
}

export default CardsMusica;