import Overlay from 'react-bootstrap/Overlay';
import styles from "./OpcoesMidia.module.css";



export default function OpcoesMidia({target, show}) {
    
    
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
                <a href="">Tocar</a>
                <a href="">Adicionar à biblioteca</a>
                <a href="">Adicionar à playlist</a>

              </div>
            )}
          </Overlay>
      )
}