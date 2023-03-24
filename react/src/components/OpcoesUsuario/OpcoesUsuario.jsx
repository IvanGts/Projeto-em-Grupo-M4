import React, { useState, useRef } from 'react';
import Button from 'react-bootstrap/Button';
import Overlay from 'react-bootstrap/Overlay';
import styles from './OpcoesUsuario.module.css'
import ToggleButton from "../ToggleButton/ToggleButton";

export function OpcoesUsuario(props) {
  return (
    <div className={props.className}>
      <h5>Conta</h5>
      <div className={styles.linha}>
          <a href="/perfil">
              <span>Perfil</span>
              <span className={styles.loginIcon}></span>
          </a>
      </div>
      <div className={styles.linha}>
          <span>Tema Escuro</span>
          <span><ToggleButton /></span>
      </div>
      <div className={styles.linha}>
          <a href="/" onClick={()=>{
            localStorage.clear();
          }}>
              <span>Sair</span>
          </a>
      </div>
      
    </div>
  )
}

export function OverlayModal({show, setTarget}) {
  const target = setTarget;

  return (
    <Overlay target={target.current} show={show} placement="bottom-end">
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
              borderRadius: '15px',
              ...props.style,
            }} className={styles.OverlayModal}
          >
            <OpcoesUsuario />
          </div>
        )}
      </Overlay>
  )
}

