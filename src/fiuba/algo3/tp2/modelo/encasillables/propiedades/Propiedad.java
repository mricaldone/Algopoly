package fiuba.algo3.tp2.modelo.encasillables.propiedades;

import java.util.Observable;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorNull;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.YaTienePropietarioException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public abstract class Propiedad extends Observable implements Encasillable {

	protected Jugador propietario;
	private Dinero precio;

	public Propiedad(Dinero precio_compra) {
		propietario = new JugadorNull();
		precio = precio_compra;
	}
	
	public void setPropietario(Jugador nuevo_propietario) {
		propietario = nuevo_propietario;
		this.setChanged();
		this.notifyObservers(nuevo_propietario.getColor());
	}

	public abstract void cambiarPropietario(Jugador nuevo_propietario);
	
	public Jugador getPropietario() {
		return propietario;
	}

	public void comprar(Jugador jugador) throws DineroInsuficienteException {
		if(!propietario.esNull()) throw new YaTienePropietarioException();
		jugador.pagar(precio);
		this.cambiarPropietario(jugador);
	}
	
	public Dinero getPrecio(){
		return precio;
	}
	
	public abstract boolean esNull();

	public abstract void vender();

	public abstract Dinero getAlquiler(Cubilete dados);

}
