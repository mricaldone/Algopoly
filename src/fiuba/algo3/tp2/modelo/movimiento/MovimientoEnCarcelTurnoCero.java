package fiuba.algo3.tp2.modelo.movimiento;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.NoPuedePagarFianzaException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public class MovimientoEnCarcelTurnoCero implements Movimiento {

	private Movimiento movimiento_original;
	
	public MovimientoEnCarcelTurnoCero(Movimiento movimiento_normal) {
		movimiento_original = movimiento_normal;
	}

	@Override
	public Encasillable verActual() {
		return movimiento_original.verActual();
	}

	@Override
	public void avanzarHasta(Encasillable casillero) {
		return;
	}

	@Override
	public void avanzar(int cantidadCasilleros) {
		return;
	}
	
	@Override
	public void retroceder(int cant_casilleros) {
		return;
	}

	@Override
	public void desencarcelar(Jugador jugador) throws DineroInsuficienteException {
		throw new NoPuedePagarFianzaException();
	}

	@Override
	public void avisarCambioDeTurno(Jugador jugador) {
		jugador.setMovimiento(new MovimientoEnCarcelTurnoUno(movimiento_original));
	}

	@Override
	public boolean estaEnCarcel() {
		return true;
	}
	
}
