import { styles } from "./Lists.module.css";

export default function List({tituloLista}) {
    return (
        <>
            <span>{tituloLista}</span>
            <div className={styles.Temporary}>
                Insira Cards aqui
            </div>
        </>
    )
}