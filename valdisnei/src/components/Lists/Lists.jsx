import styles from "./Lists.module.css";

export default function List(props) {
    return (
        <div className={styles.List}>
            <h3>{props.tituloLista}</h3>
            <div className={styles.Temporary}>
                {props.children}
            </div>
        </div>
    )
}