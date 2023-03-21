import github from '../../assets/vectors/github.svg'
import styles from './Footer.module.css'

function Footer(){

    return(
        <footer className={styles.Footer}>
            <div>Copyright Valdisnei, 2023</div>
            <div>Músicas  |  Filmes  |  Minha Biblioteca</div>
            <div> <img src={github}></img></div>
        </footer>
    )
}
export default Footer;