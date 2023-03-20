import Input from "../../components/Input/Input";
import ButtonV  from "../../components/Button/ButtonValdisnei";
import styles from "./Login.module.css";

export default function Login() {
    return (
        <>
        <div className={styles.LoginContainer}>
            <div>
                <h1>Login</h1>

                <span>E-mail</span>
                <Input placeholder="Digite seu email" tipo="email" name="email" required />

                <span>Senha</span>
                <Input placeholder="Digite sua senha" tipo="password" name="senha" required />
                
                <a href="#" className={styles.esqueceuSenha}>Esqueceu sua senha?</a>

                <ButtonV textoBotao={"Entrar"} classe={styles.LoginBtn}></ButtonV>
            </div>

            <div className={styles.linkCadastro}>
                <span>Ainda não tem uma conta?</span>
                <a href="">Cadastre-se</a>

            </div>
        </div>
        </>
    )
}