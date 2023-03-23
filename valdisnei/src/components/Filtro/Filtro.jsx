import { Select, Input } from "../Input/Input";

export default function Filtro () {
    return (
        <div>
            <Input></Input>
            <Select>
                <option disabled selected>- Escolha uma opção -</option>
                <option value="MASC">Artista</option>
                <option value="FEM">Ano</option>
                <option value="IND">Gênero</option>
            </Select>
        </div>
    )
}