import CardsMusica from "../../components/CardsMusica/CardsMusica";
import CardsFilme from "../../components/CardsFilme/CardsFilme";
import NomeMusica from "../../components/NomeMusica/NomeMusica";
import { List,ListMusicas } from "../../components/Lists/Lists";
import styles from './PerfilUsuario.module.css'
import Usuario from '../../assets/vectors/usuario.svg'


export default function PerfilUsuario(props){
    return(
        <>
        <div>
            <div className={styles.Container}>
            <h2>{props.NomeUsuario}</h2>
            <img src={Usuario} className={styles.Img}></img>
            </div>
            <div className={styles.Container2}>
            <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptates sequi eos consectetur in! Beatae vel ex repellat amet cumque expedita eaque sapiente accusantium dignissimos, odit in magnam modi fuga praesentium.</span>
            <div className={styles.Vazio}></div>
            </div>
            
        </div>
        <List tituloLista={"Suas playlists"}>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
        </List>
    
        <ListMusicas tituloLista={"Suas Músicas"}>
            <div className={styles.List}>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            </div>
            <div className={styles.List}>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            <NomeMusica></NomeMusica>
            </div>
        </ListMusicas>

        <List tituloLista={"Seus Filmes"}>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>
        </>
    )
}