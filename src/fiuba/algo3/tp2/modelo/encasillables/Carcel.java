package fiuba.algo3.tp2.modelo.encasillables;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.movimiento.Movimiento;
import fiuba.algo3.tp2.modelo.movimiento.MovimientoEnCarcelTurnoCero;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public class Carcel implements Encasillable {

	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) {
		Movimiento movimiento_normal = jugador.getMovimiento();
		Movimiento movimiento_carcel = new MovimientoEnCarcelTurnoCero(movimiento_normal);
		jugador.setMovimiento(movimiento_carcel);
	}
	
	@Override
	public String toString() {
		return "Carcel";
	}
	
	@Override
	public boolean esPropiedad(){
		return false;
	}
}
