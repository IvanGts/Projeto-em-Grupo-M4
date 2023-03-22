import {Input} from "../../components/Input/Input";
import ButtonV  from "../../components/Button/ButtonValdisnei";
import styles from "./RecuperarSenha.module.css";

export default function RecuperarSenha() {
    return (
        <>
        <div className={styles.RecContainer}>
            <div>
                <h1>Recuperar Senha</h1>

                <span>Digite o e-mail da sua conta para receber seu link de recuperação:</span>
                <Input placeholder="Digite seu email" tipo="email" name="email" required />

                <ButtonV textoBotao={"Enviar"} classe={styles.LoginBtn}></ButtonV>
            </div>

            <div className={styles.linkCadastro}>
                <span>Ainda não tem uma conta?</span>
                <a href="/cadastro">Cadastre-se</a>
            </div>
            <div className={styles.linkCadastro}>
                <span>Já tem uma conta?</span>
                <a href="/login">Login</a>
                </div>
        </div>
        </>
    )
}