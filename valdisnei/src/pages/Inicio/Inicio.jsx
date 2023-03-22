import Carrossel from "../../components/Carrossel/Carrossel";
import List from "../../components/Lists/Lists";
import {Chamada, ChamaParaCadastro} from "../../components/Chamada/Chamada";
import CardsMusica from "../../components/CardsMusica/CardsMusica";
import CardsFilme from "../../components/CardsFilme/CardsFilme";
import Login from "../Login/Login";

export function Inicio() {
    return (
        <>
        <Carrossel />
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

        <Chamada />

        <ChamaParaCadastro />

        </>
    )
}

export function InicioLogged() {
    return (
        <>
        <Carrossel />
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