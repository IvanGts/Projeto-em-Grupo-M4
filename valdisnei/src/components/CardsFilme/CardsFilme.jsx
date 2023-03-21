import Card from 'react-bootstrap/Card';
import styles from './CardsF.module.css'

function CardsFilme() {
  return (
    <Card className={styles.card}>
      <Card.Img className={styles.img} variant="top" src="https://cdn.ome.lt/9_sC4tyWRmMNxyNvC8wg-30jXzw=/837x0/smart/uploads/conteudo/fotos/Lista-03_XpwI7bI.jpg" />
      <Card.Body className={styles["card-body"]}>
        <Card.Title className={styles["card-title"]}>Star Wars-Uma nova esperança</Card.Title>
      </Card.Body>
    </Card>
  )
}

export default CardsFilme;