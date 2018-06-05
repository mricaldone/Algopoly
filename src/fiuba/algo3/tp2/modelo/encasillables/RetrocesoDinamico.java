package fiuba.algo3.tp2.modelo.encasillables;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;

public class RetrocesoDinamico implements Encasillable{
	
	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) {
		int cant_casilleros = obtenerCantCasilleros(jugador, dados);
		jugador.retroceder(cant_casilleros);
	}
	
	@Override
	public String toString() {
		return "Retroceso Dinamico";
	}
	
	@Override
	public boolean esPropiedad(){
		return false;
	}
	
	public int obtenerCantCasilleros(Jugador jugador, Cubilete dados) {
		int cant_casilleros = 0;
		int cant_propiedades = jugador.getCantidadDePropiedades();
		int cant_efectivo = jugador.obtenerDinero().obtenerMontoEntero();
		int nro_sacado = dados.sumarValores();
		if(nro_sacado > 1 && nro_sacado < 7) cant_casilleros = nro_sacado - cant_propiedades;
		if(nro_sacado > 6 && nro_sacado < 11) cant_casilleros = cant_efectivo % nro_sacado;
		if(nro_sacado > 10 && nro_sacado < 13) cant_casilleros = nro_sacado - 2;
		if(cant_casilleros < 0) return 0;
		return cant_casilleros;
	}

}
