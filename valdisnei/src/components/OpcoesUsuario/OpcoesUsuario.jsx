import React, { useState, useRef } from 'react';
import Button from 'react-bootstrap/Button';
import Overlay from 'react-bootstrap/Overlay';
import styles from './OpcoesUsuario.module.css'
import ToggleButton from "../ToggleButton/ToggleButton";

export default function OpcoesUsuario() {
  const [show, setShow] = useState(false);
  const target = useRef(null);

  return (
    <>
      <Button variant="danger" ref={target} onClick={() => setShow(!show)}>
        Click me to see
      </Button>
      <Overlay target={target.current} show={show} placement='bottom'>
        {({
          placement: _placement,
          arrowProps: _arrowProps,
          show: _show,
          popper: _popper,
          hasDoneInitialMeasure: _hasDoneInitialMeasure,
          ...props
        }) => (
          <div
            {...props}
            style={{
              position: 'absolute',
              backgroundColor: 'var(--elementos_neutros_escuro)',
              padding: '0.9em 0.9em',
              color: 'white',
              borderRadius: '20px',
              ...props.style,
            }} className={styles.OverlayModal}
          >
            <h5>Conta</h5>
            <div className={styles.linha}>
                <a href="#">
                    <span>Perfil</span>
                    <span className={styles.loginIcon}></span>
                </a>
            </div>
            <div className={styles.linha}>
                <span>Tema Escuro</span>
                <span><ToggleButton /></span>
            </div>
          </div>
        )}
      </Overlay>
    </>
  );
}

