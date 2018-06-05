package fiuba.algo3.tp2.modelo.movimiento;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.IterTablero;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class MovimientoNormal implements Movimiento {

	private IterTablero posicion;

	public MovimientoNormal(Tablero tablero) {
		posicion = tablero.crearIterador();
	}
	
	@Override
	public void avanzar(int cantidadCasilleros) {
		for (int i = 0; i < cantidadCasilleros; i++) posicion.avanzar();
	}
	
	@Override
	public void retroceder(int cantidadCasilleros) {
		for (int i = 0; i < cantidadCasilleros; i++) posicion.retroceder();
	}
	
	@Override
	public void avanzarHasta(Encasillable casillero) {
		posicion.avanzarHasta(casillero);
	}

	@Override
	public Encasillable verActual() {
		return this.posicion.verActual();
	}

	@Override
	public void desencarcelar(Jugador jugador) throws DineroInsuficienteException {
		return;
	}

	@Override
	public void avisarCambioDeTurno(Jugador jugador) {
		return;
	}

	@Override
	public boolean estaEnCarcel() {
		return false;
	}

}
