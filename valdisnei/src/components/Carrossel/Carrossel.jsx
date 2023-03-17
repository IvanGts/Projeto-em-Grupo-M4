import Carousel from 'react-bootstrap/Carousel';
import styles from './Carrossel.module.css';
import './Carrossel.css';

function Carrossel() {
  return (
    <Carousel 
      prevIcon={<svg width="30" height="37" viewBox="0 0 30 37" fill="none" xmlns="http://www.w3.org/2000/svg">
      <path d="M0.152466 19.328L29.2506 0.92826L29.8101 36.8116L0.152466 19.328Z" fill="#728390" fill-opacity="0.6"/>
      </svg>}
      nextIcon={<svg width="31" height="39" viewBox="0 0 31 39" fill="none" xmlns="http://www.w3.org/2000/svg">
      <path d="M30.1402 19.256L0.0187246 38.1158L0.262974 0.0114925L30.1402 19.256Z" fill="#728390" fill-opacity="0.6"/>
      </svg>
      } >
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