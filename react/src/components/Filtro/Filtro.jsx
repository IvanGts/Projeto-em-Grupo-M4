import { Select, Input } from "../Input/Input";
import ButtonV  from "../../components/Button/ButtonValdisnei";
import styles from "./Filtro.module.css"

export default function Filtro () {
    return (
        <div classe={styles.DivFilter}>
            <Input classe={styles.InputFilter}></Input>
            <Select>
                <option disabled selected>- Escolha uma opção -</option>
                <option value="MASC">Artista</option>
                <option value="FEM">Ano</option>
                <option value="IND">Gênero</option>
            </Select>
            <ButtonV classe={styles.ButtonFilter} textoBotao="Search"></ButtonV>
        </div>
    )
}