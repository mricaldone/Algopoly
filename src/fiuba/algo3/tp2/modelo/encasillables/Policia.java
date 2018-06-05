package fiuba.algo3.tp2.modelo.encasillables;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public class Policia implements Encasillable {

	private Carcel carcel;
	
	public Policia(Carcel casillero_carcel) {
		this.carcel = casillero_carcel;
	}

	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados){
		jugador.avanzarHasta(carcel);
		jugador.aplicarEfectoDeCasilleroActual(dados);
	}
	
	@Override
	public String toString() {
		return "Policia";
	}

	@Override
	public boolean esPropiedad(){
		return false;
	}
}
