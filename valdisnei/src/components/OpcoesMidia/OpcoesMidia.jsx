import React, { useState } from 'react';
import Overlay from 'react-bootstrap/Overlay';
import Button from 'react-bootstrap/Button';
import Modal from 'react-bootstrap/Modal';
import styles from "./OpcoesMidia.module.css";



export default function OpcoesMidia({target, show}) {
    const [modalShow, setModalShow] = useState(false);

    const handleClose = () => setModalShow(false);
    const handleShow = () => setModalShow(true);
  
    
    
    return ( <>
    <Modal show={modalShow} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Escolha a playlist:</Modal.Title>
        </Modal.Header>
        <Modal.Body>Woohoo, you're reading this text in a modal!</Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Cancelar
          </Button>
        </Modal.Footer>
      </Modal>
      
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
                <a href="#">Tocar</a>
                <a href="#">Adicionar à biblioteca</a>
                <a href="#" onClick={handleShow} >Adicionar à playlist</a>
              </div>
            )}
          </Overlay>
          </>)
}