import CardsMusica from "../../components/CardsMusica/CardsMusica";
import CardsFilme from "../../components/CardsFilme/CardsFilme";
import NomeMusica from "../../components/NomeMusica/NomeMusica";
import { List,ListMusicas } from "../../components/Lists/Lists";
import { useState, useEffect } from "react";
import styles from './PerfilArtista.module.css'
import Usuario from '../../assets/vectors/usuario.svg'
import { url } from "../../services/api";
import axios from "axios";


export function PerfilMusico(props){
        
    return(
        <>
        <div>
            <div className={styles.Container}>
            <h2>{props.NomeUsuario}</h2>
            <img src={Usuario} className={styles.Img}></img>
            </div>
            <div className={styles.Container2 + " dark"}>
            <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptates sequi eos consectetur in! Beatae vel ex repellat amet cumque expedita eaque sapiente accusantium dignissimos, odit in magnam modi fuga praesentium.</span>
            <div className={styles.Vazio}></div>
            </div>
            
        </div>
    
        <ListMusicas tituloLista={"Músicas do Artista"}>
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

        </>
    )
}

export default PerfilMusico;

export function PerfilAtor(props){

    const [values, setValues] = useState([]);
  console.log("values", values);

  const getApi = () => {
    url.get("/artistas/todosartistas").then((response) => {
      console.log(response);
      setValues(response.data);
    });
}

    useEffect(() => {
      getApi();
    }, []);

    return(
        <>
        <div>
            <div className={styles.Container}>
            <h2>{props.NomeArtista}</h2>
            <img src={Usuario} className={styles.Img}></img>
            </div>
            <div className={styles.Container2}>
            <span> {props.descricao}
                </span>
            <div className={styles.Vazio}></div>
            </div>
            
        </div>
    
        <List tituloLista="Filmes que participou">
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>

        </>
    )
}
