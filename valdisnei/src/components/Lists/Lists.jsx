import styles from "./Lists.module.css";

export function List(props) {
    return (
        <div className={styles.List + " dark"}>
            <h3>{props.tituloLista}</h3>
            <div className={styles.Temporary}>
                {props.children}
            </div>
        </div>
    )
}

export function ListMusicas(props){
    return (
        <div className={styles.List + " dark"}>
            <h3>{props.tituloLista}</h3>
            <div className={styles.ListMusicas}>
                {props.children}
            </div>
            </div>
        )
}

export default List;