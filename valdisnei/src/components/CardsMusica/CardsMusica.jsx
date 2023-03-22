import Card from 'react-bootstrap/Card';
import styles from './CardsM.module.css'

function CardsMusica() {
  return (
    <Card className={styles.card}>
      <Card.Img className={styles.img} variant="top" src="https://cdn.shopify.com/s/files/1/0522/1610/3083/articles/MILEY_CYRUS_FLOWERS_180x.png?v=1674751436" />
      <Card.Body className={styles["card-body"]}>
        <Card.Title className={styles["card-title"]}>Flowers</Card.Title>
        <Card.Text className={styles["card-text"]}> Miley Cirus</Card.Text>
        <Card.Text className={styles["card-text"]}> Flowers</Card.Text>
      </Card.Body>
    </Card>
  )
}

export default CardsMusica;