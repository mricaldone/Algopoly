package fiuba.algo3.tp2.modelo.encasillables;

import java.util.HashMap;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.premios.Premio;
import fiuba.algo3.tp2.modelo.tablero.Encasillable; 

public class Quini6 implements Encasillable{
	
	/*** PARA ESTA SOLUCION SE UTILIZO EL PATRON STATE ***/
	
	private HashMap<Jugador, Premio> jugadoresGanadores;

	public Quini6(){
		jugadoresGanadores = new HashMap<Jugador, Premio> ();
	}
	
	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) {
		
		if(!jugadoresGanadores.containsKey(jugador)) {
			jugadoresGanadores.put(jugador, new Premio());
		}
		
		Premio premio_actual = jugadoresGanadores.get(jugador);
		Dinero monto_premio = premio_actual.obtenerMonto();
		jugador.cobrar(monto_premio);
		premio_actual.siguientePremio();
		
	}
	
	@Override
	public String toString() {
		return "Quini 6";
	}
	
	@Override
	public boolean esPropiedad(){
		return false;
	}

	public Dinero obtenerPremio(Jugador jugador) {
		if(!jugadoresGanadores.containsKey(jugador)) {
			jugadoresGanadores.put(jugador, new Premio());
		}
		
		Premio premio_actual = jugadoresGanadores.get(jugador);
		return premio_actual.obtenerMonto();
	}

}