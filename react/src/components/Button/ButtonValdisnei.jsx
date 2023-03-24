import Button from 'react-bootstrap/Button';
import "./ButtonValdisnei.css"

function ButtonV({textoBotao, classe, click}) {
  return (
    <>
      <Button href={"#"} className={classe} onClick={click} >{textoBotao}</Button>
    </>
  );
}

export default ButtonV;