import styles from './Chamada.module.css';
import allTheMidias from "../../assets/img/allTheMidias.png";

export default function Chamada() {
    return (
        <div className={styles.Chamada}>
            <img src={allTheMidias} alt="Todas as mídias" />

            <h2>TODA A MÍDIA EM TODO O LUGAR AO MESMO TEMPO</h2>
            <span>Acesse suas músicas, filmes e séries, tudo em um só lugar</span>
        </div>
    )
}