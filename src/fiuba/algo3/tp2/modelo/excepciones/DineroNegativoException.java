package fiuba.algo3.tp2.modelo.excepciones;

@SuppressWarnings("serial")
public class DineroNegativoException extends RuntimeException {
	//ESTA HEREDA DE RUNTIME PORQUE SOLO DEBERIA SUCEDER SI SE CREA UN OBJETO DINERO CON SALDO NEGATIVO
}
