package fiuba.algo3.tp2.modelo.movimiento;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public class MovimientoEnCarcelTurnoTres implements Movimiento {

	private Movimiento movimiento_original;
	
	public MovimientoEnCarcelTurnoTres(Movimiento movimiento_normal) {
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
	public void retroceder(int cantidadCasilleros) {
		return;
	}

	@Override
	public void desencarcelar(Jugador jugador) throws DineroInsuficienteException {
		jugador.pagar(new Dinero(45000));
		jugador.setMovimiento(movimiento_original);
	}

	@Override
	public void avisarCambioDeTurno(Jugador jugador) {
		jugador.setMovimiento(movimiento_original);
	}

	@Override
	public boolean estaEnCarcel() {
		return true;
	}

}
