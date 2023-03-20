import styles from './Input.module.css'

export default function Input(props) {
    return (
        <input type={props.tipo} placeholder={props.placeholder} name={props.name} id={props.name} className={styles.TextInput} />
    )
}