import Carrossel from "../../components/Carrossel/Carrossel";
import List from "../../components/Lists/Lists";
import CardsFilme from '../../components/CardsFilme/CardsFilme'


export default function Filme() {
    return (
        <>
        <Carrossel />
        <List tituloLista={"Filmes mais Assistidos"}>
        <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>

        <List tituloLista={"Novidades"}>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>
        <List tituloLista={"Premiados"}>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
            <CardsFilme></CardsFilme>
        </List>

        </>
    )
}