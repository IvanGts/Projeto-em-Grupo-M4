import React, { useState, useRef } from 'react';
import Card from 'react-bootstrap/Card';
import styles from './CardsM.module.css'
import OpcoesMidia from '../OpcoesMidia/OpcoesMidia';

function CardsMusica(props) {

  const [show, setShow] = useState(false);
  const target = useRef(null);
  
  return (
    <Card className={styles.card}>
      <Card.Img className={styles.img} variant="top" src={props.img}/>
      <Card.Body className={styles["card-body"]}>
        <Card.Title className={styles["card-title"]}>Flowers 
        <span ref={target} onClick={() => setShow(!show)} className={styles.Toggler} >▼</span>
        </Card.Title>
        <Card.Text className={styles["card-text"]}> Miley Cirus</Card.Text>
        <Card.Text className={styles["card-text"]}> Flowers</Card.Text>
      </Card.Body>
      <OpcoesMidia show={show} target={target}></OpcoesMidia>
    </Card>
  )
}

export default CardsMusica;