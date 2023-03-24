import styles from './Chamada.module.css';
import allTheMidias from "../../assets/img/allTheMidias.png";
import { useSubmit } from 'react-router-dom';

export function Chamada() {
    return (
        <div className={styles.Chamada}>
            <img src={allTheMidias} alt="Todas as mídias" />

            <h2>TODA A MÍDIA EM TODO O LUGAR AO MESMO TEMPO</h2>
            <span>Acesse suas músicas, filmes e séries, tudo em um só lugar</span>
        </div>
    )
}

export function ChamaParaCadastro() {
    return (
        <div className={styles.ChamaParaCadastro}>
            <h3>Cadastre-se! É rápido e fácil</h3>

        <div>
            <input type="email" name="email" id="email" placeholder='Digite seu e-mail para iniciar o cadastro' />
            <button type='submit' onClick={() => {
                let email = document.querySelector('#email').value
                sessionStorage.setItem("email", email)
                window.location.pathname = "/cadastro"
            }
            }>CADASTRAR</button>
        </div>

        </div>
    )
}