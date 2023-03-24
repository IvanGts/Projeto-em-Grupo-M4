import styles from "./Header.module.css"
import { NavBarNeutra, NavBarDefault, NavBarLogado } from "../NavBar/NavBar";

export default function Header({estaLogado, neutro}) {
    // Verificar se o usuário está logado, ou se a página é neutra
    const isLoggedIn = estaLogado;

    function verificarEstaLogado() {
        if (estaLogado && !neutro) {
            return <NavBarLogado />
        } else if (!estaLogado && !neutro) {
            return <NavBarDefault />
        } else {
            return <NavBarNeutra />
        }
    }

    return (
        <header className={styles.Header}>
            
            {verificarEstaLogado()}

        </header>
    )
}