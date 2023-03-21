import styles from './ToggleButton.module.css'
import { useState } from "react";


export default function ToggleButton() {
    let isOn = true;
    
    function turn() {
        isOn = !isOn;
        if (isOn) {
            console.log(isOn);
            setTexto("ON")
            setCaixaStyle(styles.TogglerIsOn)
        } else {
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