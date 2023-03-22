import styles from './ToggleButton.module.css'
import { useState } from "react";


export default function ToggleButton() {
    let isOn = true;
    
    function turn() {
        isOn = !isOn;
        if (isOn) {
            document.querySelector("#ativeDark").checked = true;
            console.log(isOn);
            setTexto("ON")
            setCaixaStyle(styles.TogglerIsOn)
        } else {
            document.querySelector("#ativeDark").checked = false;
            console.log(isOn);
            setTexto("OFF")
            setCaixaStyle(styles.TogglerBox)
        }
    }

    const [texto, setTexto] = useState("ON");
    const [caixaStyle, setCaixaStyle] = useState(styles.TogglerIsOn)
        

    return (
        <div className={caixaStyle} onClick={turn}> {/* Caixa do Toggler */}
            <div className={styles.Toggler}> 
                {/* Toggler */}
            </div>

            <span>
                {texto}
            </span>
        </div>
    )
}