import styles from "./Lists.module.css";

export default function List({tituloLista}) {
    return (
        <div className={styles.List}>
            <h3>{tituloLista}</h3>
            <div className={styles.Temporary}>
                Insira Cards aqui
            </div>
        </div>
    )
}