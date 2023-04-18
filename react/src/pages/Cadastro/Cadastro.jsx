import {Input, Select, Senha} from "../../components/Input/Input";
import ButtonV  from "../../components/Button/ButtonValdisnei";
import imgValdisnei from "../../assets/img/Valdisneiimg.png"
import styles from "./Cadastro.module.css";
import { url } from "../../services/api";
import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";


export default function Cadastro() {
    
    const [errorMsg, setErrorMsg] = useState({nome:"",dia:"",ano:"",ddi:"",celular:"",genero:"",email:"",senha:"",confirmeSenha:""})
    // Funções de verificação de campos ---------------------->
    function verificarCampoVazio(event, mensagem) {
        const alvo = event.target;
    
        if (alvo.value === "") {
            setErrorMsg({...errorMsg, [alvo.name]:
                (mensagem===undefined?"Preencha este campo!":mensagem)})
        } else {
            setErrorMsg({...errorMsg, [alvo.name]:""})
        }
    }

    // Verifica se o e-mail está nos padrões
    function verificaEmail() {
        const email = document.querySelector("#email").value
        const regexEmail = /^[a-z0-9.]+@[a-z0-9]+\.[a-z]+(\.[a-z]+)?$/i;

        if (!regexEmail.test(email) && email!="") {
            return [false, "Insira um e-mail válido. Exemplo: example@example.com"]
        } else {
            return [true, ""]
        }
    }

    // Verifica se o telefone está nos padrões
    function verificaTelefone() {
        const numCelularCompleto = document.querySelector("#celular").value;
        const regexTel = /(?:\(?([1-9][0-9])\)?\s?|([1-9][0-9])\-?)(?:(?:9\d{4})\-?(\d{4}))/

        if (!regexTel.test(numCelularCompleto) && numCelularCompleto!="") {
            return [false, "Insira um número de celular válido."]
        } else {
            return [true, ""]
        }
    }

    // Verifica se a senha e confirmação estão ok1\ 
    function verificaSenha() {
        const senha = document.querySelector("#senha");
        const confSenha = document.querySelector("#confirmeSenha")

        if (confSenha.value == "") {
            return [false, "Preencha este campo!"]
        } else if (confSenha.value != senha.value) {
            return [false, "As senhas não batem. Confira se há algum erro de digitação."]
        } else {
            return [true, ""]
        }
    }
    
    function verificarTodosOsCampos() {
        const camposUsuario = Object.keys(newUsuario);
        const camposTelefone = Object.keys(telefone);
        let camposOk = true
        let getErrorMessages = {nome:"",dia:"",ano:"",ddi:"",celular:"",genero:"",email:"",senha:"",confirmeSenha:""};
        
        // Verificar se e-mail foi preenchido corretamente
        [camposOk, getErrorMessages.email] = verificaEmail();
        // Verificar se telefone foi preenchido corretamente
        [camposOk, getErrorMessages.celular] = verificaTelefone();
        // Verificar se a senha foi preenchida corretamente
        [camposOk, getErrorMessages.email] = verificaSenha();

        // Verificar se todos os campos de Usuário estão preenchidos
        for(const campo of camposUsuario){
            if (newUsuario[campo]==="") {
                if (campo=="telefone") {
                    
                } else {
                    getErrorMessages[campo] = "Preencha este campo!";
                    camposOk = false
                }
            } else if (campo == 'dataNascimento') {
                if (newUsuario[campo]==="01/01/1900") {
                    if(document.querySelector('#dia').value == "") {
                        getErrorMessages.dia = "Preencha este campo!";
                        camposOk = false;
                    } else if(document.querySelector('#ano').value == "") {
                        getErrorMessages.ano = "Preencha este campo!";
                        camposOk = false;
                    }
                }
            }
        }
        // Verificar se todos os campos de telefone estão preenchidos
        for(const campo of camposTelefone){
            if (campo == "ddd" || campo == "numero"){
                if (telefone[campo]==="") {
                    getErrorMessages.celular = "Preencha este campo!";
                    camposOk = false
                }
            } else {
                if (telefone[campo]==="") {
                    getErrorMessages[campo] = "Preencha este campo!";
                    camposOk = false
                }
            }
        }
        
        setErrorMsg(getErrorMessages) // Renderizar os erros encontrados
        return camposOk;
    }
    // ----------------------------------------------------------------------

    let email = sessionStorage.getItem("email");
    const [dtNascDia, setDtNascDia] = useState("01");
    const [dtNascMes, setDtNascMes] = useState("01");
    const [dtNascAno, setDtNascAno] = useState("1900");
    
    const telefoneInicial = {
        ddd : "",
        ddi : "",
        numero : ""
    }
    const [telefone, setTelefone] = useState(telefoneInicial)
    const valoresIniciais = {
        dataNascimento : dtNascDia + "/" + dtNascMes + "/" + dtNascAno,
        email : "" ,
        genero : "",
        nome:  "",
        senha : "",
        telefone : ""
    };
    
    const [newUsuario, setnewUsuario] = useState(valoresIniciais);
    useEffect(()=>setnewUsuario({...newUsuario, 'dataNascimento': (dtNascDia + "/" + dtNascMes + "/" + dtNascAno)}), [dtNascDia, dtNascMes, dtNascAno])

    const [formReady, setFormReady] = useState(false);
    // console.log(formReady);
    useEffect(()=>setFormReady(!formReady),[newUsuario.telefone])
    
    const postUsuario = (body) => {
        url.post('/usuario/cadastro', body)
        .catch((erro) => console.error(erro))
    };
    
    useEffect(()=> postUsuario(newUsuario), [formReady]);
    
    const postTelefone = (body) => {
    url.post('/telefone', body)
    .then((response) => {setnewUsuario({...newUsuario, 'telefone': response.data.id});})
    .catch((erro) => console.error(erro))
    };

    // Evento que identifica o campo e salva no json à enviar
    const handleOnChange = (event, banco, nomeBanco) => {
        const { name, value } = event.target;

        banco({...nomeBanco, [name]: value});
    };

// Retorno da página -------------------------------------------------

    return (
        <div className={styles.CadastroContainer}>
            <div className={styles.imgValdisnei}>
                <img src={imgValdisnei} alt="Valdisnei" />
            </div>

            <form onSubmit={(e)=>e.preventDefault()} className={styles.Form}>
                <h2>Toda a mídia que você quiser. <br />Quando você quiser.</h2>
                <div>
                    <label htmlFor="nome">Nome:</label>
                    <Input placeholder="Digite seu nome completo" tipo="text" name="nome" onChange={(e) => {
                        handleOnChange(e, setnewUsuario, newUsuario);
                        verificarCampoVazio(e);
                        }} required />
                    <p className={styles.mensagemErro}>&nbsp;{errorMsg.nome}&nbsp;</p>
                </div>
                
                <div>
                    <label htmlFor="dataNascimento">Data de Nascimento: </label>
                    <fieldset id="dataNascimento" name="dataNascimento" className={styles.ManyInputs}>
                        <Input placeholder="Dia" tipo="number" name="dia" min="1" max="31" required style={ {
                            width: "30%"
                        } } onChange={(e) => {
                            // Validação de campo
                            if (e.target.value.length > 2) {
                                e.target.value = e.target.value.slice(0,2);
                            } else if (e.target.value > 31) {
                                e.target.value = 31
                            } else if (e.target.value < 1) {
                                e.target.value = ""
                            }
                            verificarCampoVazio(e)

                            setDtNascDia(e.target.value.length>1?
                                         e.target.value:
                                         "0"+e.target.value);
                        }} />
                        <Select name="mes" onChange={(e) => {
                            setDtNascMes(e.target.value);
                        }}>
                            <option value="01">Janeiro</option>
                            <option value="02">Fevereiro</option>
                            <option value="03">Março</option>
                            <option value="04">Abril</option>
                            <option value="05">Maio</option>
                            <option value="06">Junho</option>
                            <option value="07">Julho</option>
                            <option value="08">Agosto</option>
                            <option value="09">Setembro</option>
                            <option value="10">Outubro</option>
                            <option value="11">Novembro</option>
                            <option value="12">Dezembro</option>
                        </Select>
                        <Input placeholder="Ano" tipo="number" name="ano" required min="1900" max={ new Date().getFullYear() } style={ {
                            width: "40%"
                        } } onChange={(e) => {
                            verificarCampoVazio(e)
                            setDtNascAno(e.target.value);
                        }} />
                    </fieldset>
                    <p className={styles.mensagemErro}>&nbsp;{errorMsg.dia==""?errorMsg.ano:errorMsg.dia}&nbsp;</p>
                </div>
                
                <div>
                    <label htmlFor="celular">Celular:</label>
                    <fieldset name="celular" className={styles.ManyInputs}>
                        <Input placeholder="DDI" tipo="number" name="ddi" required style={{
                            width: "30%"
                            }} onChange={(e) => {
                                verificarCampoVazio(e,"Preencha o DDI do país do seu número!")
                                handleOnChange(e, setTelefone, telefone)}
                            } />
                        <Input placeholder="(XX XXXXX-XXXX)" tipo="telephone" name="celular" required onChange={(e) => {
                            const numeroTelefone = e.target.value.split(/\D+/).join("");
                            const ddd = numeroTelefone.slice(0,2);
                            const cel = numeroTelefone.slice(2);
                            
                            setTelefone({...telefone, ["ddd"]: ddd, ["numero"]: cel})
                            const confirm = verificaTelefone();
                            if (confirm[1]!="") {
                                setErrorMsg({...errorMsg, celular: confirm[1]})
                            } else {
                                verificarCampoVazio(e,"Preencha o número do seu celular!")
                            }

                        }} /> 
                    </fieldset>
                    <p className={styles.mensagemErro}>&nbsp;{errorMsg.ddi===""?errorMsg.celular:errorMsg.ddi}&nbsp;</p>
                </div>
                
                <div>
                    <label htmlFor="genero">Gênero:</label>
                    <Select name="genero" onChange={(e) => {
                        if (e.target.value != '- Escolha uma opção -') {
                            handleOnChange(e, setnewUsuario, newUsuario)
                            setErrorMsg({...errorMsg, genero:""})
                        } else {
                            verificarCampoVazio(e)
                        }
                        }}>
                        <option disabled selected>- Escolha uma opção -</option>
                        <option value="MASC">Masculino</option>
                        <option value="FEM">Feminino</option>
                        <option value="IND">Outros</option>
                    </Select>
                    <p className={styles.mensagemErro}>&nbsp;{errorMsg.genero}&nbsp;</p>
                </div>
                
                <div>
                    <label htmlFor="email">E-mail:</label>
                    <Input placeholder="Digite seu email" tipo="email" name="email"
                    value={email}
                    required onChange={(e) => {
                        const confirm = verificaEmail();
                        if (confirm[1]!="") {
                            setErrorMsg({...errorMsg, email: confirm[1]})
                        } else {
                            verificarCampoVazio(e)
                        }
                        handleOnChange(e, setnewUsuario, newUsuario)
                        }} />
                    <p className={styles.mensagemErro}>&nbsp;{errorMsg.email}&nbsp;</p>
                </div>
                
                <div>
                    <div>
                        <label htmlFor="senha">Crie uma senha:</label>
                        <Senha placeholder="Digite de 6 a 12 caracteres" tipo="password" name="senha" required styleEye={
                            {height: "inherit"} }
                            onChange={(e) => {
                            if((e.target.value.length < 6 && e.target.value != "") || (e.target.length > 12 && e.target.value != "")) {
                                setErrorMsg({...errorMsg, senha: "Sua senha dever ter de 6 a 12 caracteres!"})
                            } else {
                                verificarCampoVazio(e)
                            }
                            handleOnChange(e, setnewUsuario, newUsuario)
                            }} />
                        <p className={styles.mensagemErro}>&nbsp;{errorMsg.senha}&nbsp;</p>
                    </div>
                    <div>
                        <label htmlFor="confirmeSenha">Confirme sua senha:</label>
                        <Senha placeholder="Digite novamente sua senha" name="confirmeSenha" styleEye={
                            {height: "inherit"} }
                        onChange={(e)=>{
                            const confirm = verificaSenha();
                            setErrorMsg({...errorMsg, confirmeSenha: confirm[1]})
                        }}
                        required />
                        <p className={styles.mensagemErro}>&nbsp;{errorMsg.confirmeSenha}&nbsp;</p>
                    </div>
                </div>
                
                <ButtonV textoBotao={"Cadastrar"} classe={styles.Btn}
                click={
                    (e)=>{
                        let formValidado = verificarTodosOsCampos()

                        if (formValidado) {
                            sessionStorage.clear();
                            postTelefone(telefone);
                        }
                        
                }
                }
                ></ButtonV>
                
                <div className={styles.linkCadastro}>
                    <span>Já tem uma conta?</span>
                    <a href="/login">Login</a>
                </div>
            </form>

        </div>
    )
}
