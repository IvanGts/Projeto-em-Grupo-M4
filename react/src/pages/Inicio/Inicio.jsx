import Carrossel from "../../components/Carrossel/Carrossel";
import List from "../../components/Lists/Lists";
import {Chamada, ChamaParaCadastro} from "../../components/Chamada/Chamada";
import CardsMusica from "../../components/CardsMusica/CardsMusica";
import CardsFilme from "../../components/CardsFilme/CardsFilme";
import Login from "../Login/Login";
import Filtro from "../../components/Filtro/Filtro";
import { url } from "../../services/api";
import { useState, useEffect } from "react";
import albumArtDefault from "../../assets/img/Capa do Album_default.png";
import movieArtDefault from "../../assets/img/Banner do Filme_default.png"

const musicList = [
    {img: albumArtDefault, titulo: "Flowers", artista: "Miley Cirus", album: "Flowers"},
    {img: albumArtDefault, titulo: "Flowers", artista: "Miley Cirus", album: "Flowers"},
    {img: albumArtDefault, titulo: "Flowers", artista: "Miley Cirus", album: "Flowers"},
    {img: albumArtDefault, titulo: "Flowers", artista: "Miley Cirus", album: "Flowers"},
    {img: albumArtDefault, titulo: "Flowers", artista: "Miley Cirus", album: "Flowers"},
    {img: albumArtDefault, titulo: "Flowers", artista: "Miley Cirus", album: "Flowers"}
]

function musicCard(musica) {
        return (<CardsMusica img={musica.img} titulo={musica.titulo}
            album={musica.album} artista={musica.artista} />)
    }

const movieList = [
    {img: movieArtDefault, titulo: "As Crônicas de Nárnia"},
    {img: movieArtDefault, titulo: "As Crônicas de Nárnia"},
    {img: movieArtDefault, titulo: "As Crônicas de Nárnia"},
    {img: movieArtDefault, titulo: "As Crônicas de Nárnia"},
    {img: movieArtDefault, titulo: "As Crônicas de Nárnia"},
    {img: movieArtDefault, titulo: "As Crônicas de Nárnia"}
]

function movieCard(filme) {
    return (<CardsFilme img={filme.img} titulo={filme.titulo} />)
}

export function Inicio() {

    return (
        <>
        <Carrossel />
        
        <List tituloLista={"Músicas mais Ouvidas"}> 
            {
                musicList.map(musica => musicCard(musica)
                )
            }
        </List>
        <List tituloLista={"Filmes mais Assistidos"}>
            {
                movieList.map(filme => movieCard(filme)
                )
            }
        </List>

        <Chamada />

        <ChamaParaCadastro />

        </>
    )
}

export function InicioLogged() {

    const [values1, setValues1] = useState([]);
    console.log("values", values1);
    const [values2, setValues2] = useState([]);
    console.log("values", values2);

    const getApi = () => {
    url.get("/midias/todos").then((response) => {
      console.log(response);
      setValues1(response.data);
    });
    url.get("/midias/todos").then((resp)=> {
        console.log(resp);
        setValues2(resp.data)
    });
}

    useEffect(() => {
      getApi();
    }, []);

    return (
        <>
        <Carrossel />

        <Filtro></Filtro>
        <List tituloLista={"Músicas mais Ouvidas"}> 
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
        </List>
        <List tituloLista={"Filmes mais Assistidos"}>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>

        <List tituloLista={"Para animar o seu astral"}> 
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
            <CardsMusica></CardsMusica>
        </List>
        <List tituloLista={"Premiados"}>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>

        </>
    )
}

export default Login;