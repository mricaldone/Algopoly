package fiuba.algo3.tp2.modelo.encasillables;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public class Salida implements Encasillable {

	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) {
		// no hay que sumarle plata al jugador?
		
	}

	@Override
	public String toString() {
		return "Salida";
	}
	
	@Override
	public boolean esPropiedad(){
		return false;
	}
}
