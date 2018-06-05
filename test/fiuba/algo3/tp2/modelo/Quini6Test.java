package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.Quini6;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class Quini6Test {

	Quini6 quini = new Quini6();
	Jugador jugador;
	
	@Before
	public void inicializarJugador(){
		jugador = new JugadorHumano(new Tablero(), new Dinero(0));
	}
	
	@Test
	public void test01ComportamientoNoDepenteDeLosDados(){
		quini.aplicarEfecto(jugador, null);
	}
	
	@Test
	public void test02PrimeraVezAumenta50000(){
		int dinero_antes = jugador.obtenerDinero().obtenerMontoEntero();
		quini.aplicarEfecto(jugador, null);
		Assert.assertEquals(dinero_antes + 50000, jugador.obtenerDinero().obtenerMontoEntero());
	}
	
	@Test
	public void test03SegundaVezAumenta30000(){
		quini.aplicarEfecto(jugador, null);
		int dinero_antes = jugador.obtenerDinero().obtenerMontoEntero();
		quini.aplicarEfecto(jugador, null);
		Assert.assertEquals(dinero_antes + 30000, jugador.obtenerDinero().obtenerMontoEntero());
	}
	
	@Test
	public void test04DespuesDeLaSegundaNuncaMasAumenta(){
		quini.aplicarEfecto(jugador, null);
		quini.aplicarEfecto(jugador, null);
		for(int i=0; i < 1000; i++){			
			int dinero_antes = jugador.obtenerDinero().obtenerMontoEntero();
			quini.aplicarEfecto(jugador, null);
			Assert.assertEquals(dinero_antes, jugador.obtenerDinero().obtenerMontoEntero());
		}
	}
	
	@Test
	public void test05JugadoresDiferentesObtienenElPremioQueLeCorresponde(){
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(0));
		//Primero cae el jugador 1 y luego el 2
		quini.aplicarEfecto(jugador, null);
		int dinero_antes = jugador2.obtenerDinero().obtenerMontoEntero();
		quini.aplicarEfecto(jugador2, null);
		Assert.assertEquals(dinero_antes + 50000, jugador2.obtenerDinero().obtenerMontoEntero());
	}
}
