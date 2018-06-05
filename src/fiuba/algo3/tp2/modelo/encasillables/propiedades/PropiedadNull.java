package fiuba.algo3.tp2.modelo.encasillables.propiedades;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorNull;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;

public class PropiedadNull extends Propiedad {

	public PropiedadNull() {
		super(new Dinero(0));
		this.cambiarPropietario(new JugadorNull());
	}
	
	@Override
	public void cambiarPropietario(Jugador nuevo_propietario) {
		this.propietario = nuevo_propietario;

	}

	@Override
	public String toString() {
		return "Propiedad Null";
	}

	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) throws DineroInsuficienteException {
		return;
	}

	@Override
	public boolean esNull() {
		return true;
	}


	@Override
	public void vender() {
		return;
	}

	@Override
	public boolean esPropiedad() {
		return false;
	}

	@Override
	public Dinero getAlquiler(Cubilete dados) {
		return new Dinero(0);
	}

}
