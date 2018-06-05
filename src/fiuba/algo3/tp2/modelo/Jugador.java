package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;
import java.util.Observable;

import fiuba.algo3.tp2.controlador.ControladorJugador;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.excepciones.BancaRotaException;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.movimiento.Movimiento;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import javafx.scene.paint.Color;

public abstract class Jugador extends Observable{

	private ControladorJugador controlador;
	
	public abstract String getNombre();
	
	public abstract Color getColor();
	
	//esto lo haria en constructor
	public abstract void setNombre(String nombre);
	
	//esto lo haria en constructor
	public abstract void setColor(Color color);
	
	public abstract int getCantidadDePropiedades();
			
	public abstract Dinero obtenerDinero();
	
	public abstract void comprar(Propiedad propiedad) throws DineroInsuficienteException;
	
	public abstract void comprarCasilleroActual() throws DineroInsuficienteException;

	public abstract Encasillable obtenerCasilleroActual();

	public abstract void pagarFianza() throws DineroInsuficienteException;
	
	public abstract void aplicarEfectoDeCasilleroActual(Cubilete cubilete) throws DineroInsuficienteException, BancaRotaException;

	public abstract void avanzarHasta(Encasillable casillero);
	
	public abstract void pagar(Dinero monto) throws DineroInsuficienteException, BancaRotaException;
	
	public abstract void cobrar(Dinero monto);

	public abstract void avanzar(int cant_casilleros);

	public abstract void retroceder(int cant_casilleros);
	
	public abstract boolean isNull();

	public abstract void entregarPropiedad(Jugador destinatario, Propiedad propiedad);

	public abstract void agregarPropiedad(Propiedad propiedad);

	public abstract boolean esNull();

	public abstract Movimiento getMovimiento();

	public abstract void setMovimiento(Movimiento movimiento);

	public abstract void avisarCambioDeTurno();
	
	public abstract ArrayList<Propiedad> getPropiedades();

	public ControladorJugador getControlador() {
		return this.controlador;
	}
	
	public void setControlador(ControladorJugador controlador){
		this.controlador=controlador;
	}
	
	public abstract ArrayList<String> getListaComprables();

	public abstract void quitarPropiedad(Propiedad propiedad);

	public abstract boolean estaEncarcelado();

	public abstract Dinero obtenerPatrimonio();
	
}
