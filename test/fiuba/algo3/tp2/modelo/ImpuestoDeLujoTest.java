package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.ImpuestoDeLujo;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.Tablero;


public class ImpuestoDeLujoTest {

	Jugador jugador;
	Encasillable impuesto = new ImpuestoDeLujo();
	private static final double DELTA = 1e-15;
	
	@Before
	public void inicializar(){
		jugador = new JugadorHumano(new Tablero(), new Dinero(100000));
	}
	
	@Test
	public void efectoNoDependeDeDados() throws DineroInsuficienteException{
		impuesto.aplicarEfecto(jugador, null);
	}
	
	@Test
	public void jugadorQueInteractuaPierde10PorCientoDelDinero() throws DineroInsuficienteException{
		int inicial = jugador.obtenerDinero().obtenerMontoEntero();
		impuesto.aplicarEfecto(jugador, null);
		Assert.assertEquals(inicial * 0.9, jugador.obtenerDinero().obtenerMontoEntero(), DELTA);
	}
	
	@Test
	public void jugadorQueNoTieneDineroNoLanzaExcepcionPorSerPorcentaje() throws DineroInsuficienteException{
		jugador.pagar(new Dinero(100000));
		impuesto.aplicarEfecto(jugador, null);
	}
}
