import Card from 'react-bootstrap/Card';
import styles from './NomeMusica.module.css'

function NomeMusica() {
  return (
    <Card className={styles.card}>
      <Card.Img className={styles.Img} variant="top" src="https://imgs.casasbahia.com.br/1501009140/1xg.jpg?imwidth=500" />
      <Card.Body className={styles["card-body"]}>
        <Card.Title className={styles["card-title"]}>That's What I Like</Card.Title>
        <Card.Text className={styles["card-text"]}> 24K Magic</Card.Text>
        <Card.Text className={styles["card-text"]}> Bruno Mars</Card.Text>
      </Card.Body>
    </Card>
  )
}

export default NomeMusica;