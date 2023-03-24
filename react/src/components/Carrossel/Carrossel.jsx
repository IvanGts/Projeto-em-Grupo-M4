import Carousel from 'react-bootstrap/Carousel';
import styles from './Carrossel.module.css';
import nextButton from '../../assets/vectors/nextButton.svg';
import prevButton from '../../assets/vectors/prevButton.svg';
import './Carrossel.css';

function Carrossel() {
  return (
    <Carousel 
      prevIcon={ <img src={prevButton} alt="anterior" /> }
      nextIcon={ <img src={nextButton} alt="próxima" /> } >
      <Carousel.Item>
        <div className={styles.img} />
        <Carousel.Caption>
          <h3>First slide label</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
      <div className={styles.img} />
        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <div className={styles.img} />

        <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>
            Praesent commodo cursus magna, vel scelerisque nisl consectetur.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}

export default Carrossel;