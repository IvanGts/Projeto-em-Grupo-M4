import Carrossel from "../components/Carrossel/Carrossel";
import List from "../components/Lists/Lists";
import {Chamada, ChamaParaCadastro} from "../components/Chamada/Chamada";

export default function Inicio() {
    return (
        <>
        <Carrossel />
        <List tituloLista={"Músicas mais Ouvidas"} />
        <List tituloLista={"Filmes mais Assistidos"}/>

        <Chamada />

        <ChamaParaCadastro />

        </>
    )
}