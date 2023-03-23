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
            <div className={styles.Container2 + " dark"}>
            <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptates sequi eos consectetur in! Beatae vel ex repellat amet cumque expedita eaque sapiente accusantium dignissimos, odit in magnam modi fuga praesentium.</span>
            <div className={styles.Vazio}></div>
            </div>
            
        </div>
        <List tituloLista={"Suas playlists"}>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-do-equalizador-da-m%C3%BAsica-vetor-36948272.jpg"}/>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-do-equalizador-da-m%C3%BAsica-vetor-36948272.jpg"}/>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-14861329.jpg"}/>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-14861329.jpg"}/>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-14861329.jpg"}/>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-do-equalizador-da-m%C3%BAsica-vetor-36948272.jpg"}/>
        <CardsMusica img={"https://thumbs.dreamstime.com/b/fundo-abstrato-do-equalizador-da-m%C3%BAsica-vetor-36948272.jpg"}/>
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
            <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"}/>
            <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"}/>
            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"}/>
            <CardsFilme  img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"}/>
            <CardsFilme  img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"}/>
            <CardsFilme />
        </List>
        </>
    )
}