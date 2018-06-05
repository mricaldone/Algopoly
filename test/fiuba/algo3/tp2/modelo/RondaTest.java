package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.excepciones.NoHayJugadoresException;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class RondaTest {

	@Test
	public void testAgregarJugadorEnUnaRondaVaciaDevuelveElJugadorAgregado() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador);
		Assert.assertEquals(jugador, turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testAgregarJugadorEnUnaRondaConUnJugadorDevuelveElPrimerJugador() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		Assert.assertEquals(jugador1, turnos.obtenerJugadorActual());
	}

	@Test
	public void testAvanzarUnTurnoEnUnaRondaDeUnJugadorVuelveAlMismoJugador() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador);
		turnos.avanzarTurno();
		Assert.assertEquals(jugador, turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testAvanzarUnTurnoEnUnaRondaDeDosJugadoresPasaAlSiguienteJugador() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(2));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.avanzarTurno();
		Assert.assertEquals(jugador2, turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testAvanzarDosTurnosEnUnaRondaDeDosJugadoresVuelveAlPrimerJugador() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(2));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.avanzarTurno();
		turnos.avanzarTurno();
		Assert.assertEquals(jugador1, turnos.obtenerJugadorActual());
	}

	@Test(expected = NoHayJugadoresException.class)
	public void testRondaAlgoPolyDevuelveJugadorNull() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		turnos.obtenerJugadorActual();
	}
	
	@Test
	public void testRondaEsIterable() throws NoHayJugadoresException {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		jugadores.add(jugador1);
		turnos.agregarJugador(jugador2);
		jugadores.add(jugador2);
		turnos.agregarJugador(jugador3);
		jugadores.add(jugador3);
		int i = 0;
		for(Jugador jugador:turnos) {
			Assert.assertEquals(jugadores.get(i), jugador);
			i++;
		}
	}
	
	@Test
	public void testRondaDe3JugadoresTiene2LuegoDeQuitar() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.quitarJugadorActual();
		Assert.assertEquals(2,turnos.contarJugadores());
	}
	
	@Test
	public void testRondaDe3JugadoresSeQuitaElPrimeroElActualEsElSegundo() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.quitarJugadorActual();
		Assert.assertEquals(jugador2,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaDe3JugadoresSeQuitaElSegundoElActualEsElTercero() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.avanzarTurno();
		turnos.quitarJugadorActual();
		//Assert.assertEquals(jugador3,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaDe3JugadoresSeQuitaElTerceroElActualEsElPrimero() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.avanzarTurno();
		turnos.avanzarTurno();
		turnos.quitarJugadorActual();
		//Assert.assertEquals(jugador1,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaDe3JugadoresSeQuitaElPrimeroEstanLosOtrosDos() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.quitarJugadorActual();
		Assert.assertEquals(jugador2,turnos.obtenerJugadorActual());
		turnos.avanzarTurno();
		//Assert.assertEquals(jugador3,turnos.obtenerJugadorActual());
		turnos.avanzarTurno();
		//Assert.assertEquals(jugador2,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaDe3JugadoresSeQuitaElSegundoEstanLosOtrosDos() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.avanzarTurno();
		turnos.quitarJugadorActual();
		//Assert.assertEquals(jugador3,turnos.obtenerJugadorActual());
		turnos.avanzarTurno();
		//Assert.assertEquals(jugador1,turnos.obtenerJugadorActual());
		turnos.avanzarTurno();
		//Assert.assertEquals(jugador3,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaDe3JugadoresSeQuitaElTerceroEstanLosOtrosDos() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador3 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.agregarJugador(jugador3);
		turnos.avanzarTurno();
		turnos.avanzarTurno();
		turnos.quitarJugadorActual();
		//Assert.assertEquals(jugador1,turnos.obtenerJugadorActual());
		turnos.avanzarTurno();
		//Assert.assertEquals(jugador2,turnos.obtenerJugadorActual());
		turnos.avanzarTurno();
		//Assert.assertEquals(jugador1,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaNoAvanzaSiJugadorSacaDobleLaPrimeraVez() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.avanzarTurno();
		Assert.assertEquals(jugador1,turnos.obtenerJugadorActual());
	}
	
	@Test
	public void testRondaAvanzaSiJugadorSacaDobleLaSegundaVez() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Ronda turnos = new Ronda(cubilete);
		Jugador jugador1 = new JugadorHumano(new Tablero(), new Dinero(100));
		Jugador jugador2 = new JugadorHumano(new Tablero(), new Dinero(100));
		turnos.agregarJugador(jugador1);
		turnos.agregarJugador(jugador2);
		turnos.avanzarTurno();
		turnos.avanzarTurno();
		Assert.assertEquals(jugador2,turnos.obtenerJugadorActual());
	}

}
