import Button from 'react-bootstrap/Button';
import "./ButtonValdisnei.css"

function ButtonV({textoBotao, classe}) {
  return (
    <>
      <Button href="#" className={classe}>{textoBotao}</Button>
    </>
  );
}

export default ButtonV;