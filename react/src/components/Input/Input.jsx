import styles from './Input.module.css'
import eyeOff from "../../assets/vectors/eye-off.svg";
import eye from "../../assets/vectors/baseline-eye.svg";
import { useState } from 'react';

export function Input(props) {

    return (
        <input type={props.tipo} placeholder={props.placeholder} name={props.name} id={props.name} className={styles.TextInput} required={props.required}
        min={props.min} max={props.max} pattern={props.pattern} defaultValue={props.value} style={props.style} />
    )
}

export function Senha(props) {
    const [mostraSenha, setMostraSenha] = useState(false)

    return (
        <div className={styles.BoxSenha}>
            <input type={mostraSenha?'text':'password'} placeholder={props.placeholder} name={props.name} id={props.name} className={styles.TextInput + " " + styles.Senha} required={props.required}
            minLength="6" maxLength="12" pattern={props.pattern} style={props.style} />
            <img src={mostraSenha?eyeOff:eye} 
            alt={mostraSenha?'Mostrar senha':'Ocultar senha'} 
            title={mostraSenha?'Mostrar senha':'Ocultar senha'} 
            className={styles.Eye}
            onClick={()=> setMostraSenha(!mostraSenha)} />            
        </div>
    )
}

export function Select(props) {
    return (
        <select name={props.name} id={props.name} className={styles.TextInput}>
            {props.children}
        </select>
    );
  }

export default Input;