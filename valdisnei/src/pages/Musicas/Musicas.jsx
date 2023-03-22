import Carrossel from "../../components/Carrossel/Carrossel";
import List from "../../components/Lists/Lists";
import CardsMusica from '../../components/CardsMusica/CardsMusica'


export default function Musicas() {
    return (
        <>
        <Carrossel />
        <List tituloLista={"Mais Ouvidas"}>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>

        </List>

        <List tituloLista={"Lançamentos da Semana"}>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>


        </List>
        <List tituloLista={"Novidades em Alta"}>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        <CardsMusica></CardsMusica>
        

        </List>

        </>
    )
}