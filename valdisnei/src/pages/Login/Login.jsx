import {Input, Senha} from "../../components/Input/Input";
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
                <Senha placeholder="Digite sua senha" name="senha" required />
                
                <a href="#" className={styles.esqueceuSenha}>Esqueceu sua senha?</a>

                <ButtonV textoBotao={"Entrar"} classe={styles.LoginBtn} click={
                    () => { console.log('AAAAAA');
                        localStorage.setItem('id', 1)
                        localStorage.setItem('logado', true)
                        window.location.pathname = '/';
                    }
                }></ButtonV>
            </div>

            <div className={styles.linkCadastro}>
                <span>Ainda não tem uma conta?</span>
                <a href="/cadastro">Cadastre-se</a>

            </div>
        </div>
        </>
    )
}