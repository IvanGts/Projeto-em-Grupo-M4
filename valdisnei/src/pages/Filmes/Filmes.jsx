import Carrossel from "../../components/Carrossel/Carrossel";
import List from "../../components/Lists/Lists";
import CardsFilme from '../../components/CardsFilme/CardsFilme'


export default function Filme() {
    return (
        <>
        <Carrossel />
        <List tituloLista={"Filmes mais Assistidos"}>
        <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"} titulodofilme={" Tudo em Todo o Lugar ao Mesmo Tempo"}/>

            <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"} titulodofilme={"O Menu"}/>
            <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"} titulodofilme={"Pantera Negra: Wakanda para Sempre"}/>
            <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"} titulodofilme={"Top Gun: Maverick"} />
            <CardsFilme img={"https://previews.123rf.com/images/vectorpocket/vectorpocket1801/vectorpocket180100093/92747936-fond-de-cin%C3%A9ma-bleu-avec-des-objets-r%C3%A9alistes-en-3d-popcorn-bande-billets-et-clap-illustration.jpg"} titulodofilme={"Aftersun"} />
        </List>

        <List tituloLista={"Novidades"}>
            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"} titulodofilme={"Shazam! Fúria dos Deuses"}/>

            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"} titulodofilme={"John Wick 4: Baba Yaga"}/>

            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"} titulodofilme={"Creed 3"}/>

            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"} titulodofilme={"65: Ameaça Pré-Histórica"}/>

            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"} titulodofilme={"Tudo Sob Controle"}/>

            <CardsFilme img={"https://img.freepik.com/vetores-premium/poster-de-cinema-realista-pipoca-balde-fita-de-filme-de-claquete-e-bobina-pipoca-voando-em-movimento_208581-1714.jpg?w=2000"} titulodofilme={"Coração de Neon"}/>
        </List>
        <List tituloLista={"Premiados"}>
            <CardsFilme img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"} titulodofilme={"12 Anos de Escravidão"}/>

            <CardsFilme img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"} titulodofilme={"Cisne Negro"}/>

            <CardsFilme img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"} titulodofilme={"Histórias Cruzadas"}/>

            <CardsFilme img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"} titulodofilme={"O Poderoso Chefão"}/>

            <CardsFilme img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"} titulodofilme={"A Teoria de Tudo"}/>

            <CardsFilme img={"https://www.unioncdmx.mx/wp-content/uploads/2022/08/BOLETOS-CINE-40-PESOS-1024x576.jpg"} titulodofilme={"Moonlight Sob a Luz do Luar"}/>
        </List>

        </>
    )
}