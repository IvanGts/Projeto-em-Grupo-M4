import Card from 'react-bootstrap/Card';
import styles from './NomeMusica.module.css'

function NomeMusica(props) {
  return (
    <Card className={styles.card}>
      <Card.Img className={styles.Img} variant="top" src={props.img} />
      <Card.Body className={styles["card-body"]}>
        <Card.Title className={styles["card-title"]}>{props.musica}</Card.Title>
        <Card.Text className={styles["card-text"]}>{props.album}</Card.Text>
        <Card.Text className={styles["card-text"]}>{props.artista}</Card.Text>
      </Card.Body>
    </Card>
  )
}

export default NomeMusica;