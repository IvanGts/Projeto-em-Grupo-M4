import styles from "./Header.module.css"

export default function Header() {
    return (
        <header className={styles.Header}>
            {/* Logo */}
            <img src="" alt="Logo Valdisnei" className="logo" />

            <nav>
                <ul>
                    <li>Música</li>
                    <li>Filmes</li>
                </ul>
                <ul>
                    <li>CADASTRE-SE</li>
                    <li>Login</li>
                </ul>
            </nav>
        </header>
    )
}