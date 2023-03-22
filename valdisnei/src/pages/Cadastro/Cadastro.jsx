import {Input, Select, Senha} from "../../components/Input/Input";
import ButtonV  from "../../components/Button/ButtonValdisnei";
import imgValdisnei from "../../assets/img/Valdisneiimg.png"
import styles from "./Cadastro.module.css";

export default function Cadastro() {
    let email = sessionStorage.getItem("email");
    return (
        <div className={styles.CadastroContainer}>
            <div className={styles.imgValdisnei}>
                <img src={imgValdisnei} alt="Valdisnei" />
            </div>

            <div className={styles.Form}>
                <h2>Toda a mídia que você quiser. <br />Quando você quiser.</h2>
                <div>
                    <label for="nome">Nome:</label>
                    <Input placeholder="Digite seu nome" tipo="text" name="nome" required />
                
                </div>
                
                <div>
                    <label for="dataNascimento">Data de Nascimento: </label>
                    <fieldset id="dataNascimento" name="dataNascimento" className={styles.ManyInputs}>
                        <Input placeholder="Dia" tipo="number" name="dia" min="1" max="31" required style={ {
                            width: "30%"
                        } } />
                        <Select name="mês">
                            <option value="JAN">Janeiro</option>
                            <option value="FEV">Fevereiro</option>
                            <option value="MAR">Março</option>
                            <option value="ABR">Abril</option>
                            <option value="MAI">Maio</option>
                            <option value="JUN">Junho</option>
                            <option value="JUL">Julho</option>
                            <option value="AGO">Agosto</option>
                            <option value="SET">Setembro</option>
                            <option value="OUT">Outubro</option>
                            <option value="NOV">Novembro</option>
                            <option value="DEZ">Dezembro</option>
                        </Select>
                        <Input placeholder="Ano" tipo="number" name="ano" required min="1900" max={ new Date().getFullYear() } style={ {
                            width: "40%"
                        } } />
                    </fieldset>
                </div>
                
                <div>
                    <label for="celular">Celular:</label>
                    <fieldset id="celular" name="celular" className={styles.ManyInputs}>
                        <Input placeholder="DDI" tipo="number" name="ddi" required style={{
                            width: "30%"
                            }} />
                        <Input placeholder="(XX XXXXX-XXXX)" tipo="telephone" name="celular" required />
                    </fieldset>
                </div>
                
                <div>
                    <label for="genero">Gênero:</label>
                    <Select name="genero">
                        <option disabled selected>- Escolha uma opção -</option>
                        <option value="MASC">Masculino</option>
                        <option value="FEM">Feminino</option>
                        <option value="IND">Indefinido</option>
                    </Select>
                
                </div>
                
                <div>
                    <label for="email">E-mail:</label>
                    <Input placeholder="Digite seu email" tipo="email" name="email"
                    value={email}
                    required />
                
                </div>
                
                <div>
                    <div>
                        <label for="senha">Crie uma senha:</label>
                        <Senha placeholder="Digite de 6 a 12 caracteres" tipo="password" name="senha" required />
                    
                    </div>
                    <div>
                        <label for="confirmeSenha">Confirme sua senha:</label>
                        <Senha placeholder="Digite novamente sua senha" name="confirmeSenha" required />
                    
                    </div>
                </div>
                
                <ButtonV textoBotao={"Cadastrar"} classe={styles.Btn}
                click={
                    ()=>sessionStorage.clear()
                }
                ></ButtonV>
                
                <div className={styles.linkCadastro}>
                    <span>Já tem uma conta?</span>
                    <a href="/login">Login</a>
                </div>
            </div>

        </div>
    )
}