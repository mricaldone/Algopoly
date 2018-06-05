package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.DineroNegativoException;

public class Dinero {

	private int cantidad;

	public Dinero(int cantidad) throws DineroNegativoException {
		if (cantidad < 0)
			throw new DineroNegativoException();
		this.cantidad = cantidad;
	}

	public int obtenerMontoEntero() {
		return this.cantidad;
	}

	public void aumentarCantidad(Dinero monto) {
		this.cantidad += monto.obtenerMontoEntero();
	}

	public void disminuirCantidad(Dinero monto) throws DineroInsuficienteException {
		if (this.cantidad < monto.obtenerMontoEntero())
			throw new DineroInsuficienteException();
		this.cantidad -= monto.obtenerMontoEntero();
	}

	public Dinero obtenerPorcentaje(int porcentaje) {
		int resultado = (porcentaje*this.cantidad)/100;
		return new Dinero(resultado);
	}
	
	public Dinero clone() {
		return new Dinero(this.cantidad);
	}

	public boolean esMayorQue(Dinero otro_monto) {
		return cantidad > otro_monto.obtenerMontoEntero();
	}
	
	public String toString() {
		return String.valueOf(cantidad);
	}

}
