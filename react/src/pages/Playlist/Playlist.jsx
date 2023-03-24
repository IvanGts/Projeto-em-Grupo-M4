import NomeMusica from "../../components/NomeMusica/NomeMusica";
import {ListMusicas} from "../../components/Lists/Lists";
import styles from './Playlist.module.css'
import Usuario from '../../assets/vectors/usuario.svg'

export default function Playlist(props){
    return(
        <>
        <div>
            <div className={styles.Container}>
            <h2>{props.nomeUsuario}</h2>
            <img src={Usuario} className={styles.Img}></img>
            </div>
            <div className={styles.Container2}>
            <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptates sequi eos consectetur in! Beatae vel ex repellat amet cumque expedita eaque sapiente accusantium dignissimos, odit in magnam modi fuga praesentium.</span>
            <div className={styles.Vazio}></div>
            </div>
            
        </div>
        <ListMusicas tituloLista={"Suas Músicas"}>
            <div className={styles.List}>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            </div>
            <div className={styles.List}>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            </div>
        </ListMusicas>
        </>
    )
}