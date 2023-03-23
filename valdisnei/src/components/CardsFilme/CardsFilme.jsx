import Card from 'react-bootstrap/Card';
import styles from './CardsF.module.css'

function CardsFilme(props) {
  return (
    <Card className={styles.card}>
      <Card.Img className={styles.img} variant="top" src={props.img} />
      <Card.Body className={styles["card-body"]}>
        <Card.Title className={styles["card-title"]}>{props.titulodofilme}</Card.Title>
      </Card.Body>
    </Card>
  )
}

export default CardsFilme;