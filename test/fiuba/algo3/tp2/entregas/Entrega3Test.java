package fiuba.algo3.tp2.entregas;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorHumano;
import fiuba.algo3.tp2.modelo.Ronda;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Subte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Tren;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.excepciones.BancaRotaException;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class Entrega3Test {
	
	public Tablero tablero = new Tablero();
	
	@Test
	public void test01_JugadorArrojaDosDadosTienenElMismoValorVuelveAJugar() {
		Jugador jugador1 = new JugadorHumano(tablero, new Dinero(10000));
		Jugador jugador2 = new JugadorHumano(tablero, new Dinero(10000));
		Cubilete dados = new Cubilete();
		dados.agregar(new DadoCargado(1));
		dados.agregar(new DadoCargado(1));
		Ronda ronda = new Ronda(dados);
		ronda.agregarJugador(jugador1);
		ronda.agregarJugador(jugador2);
		dados.lanzar();
		ronda.avanzarTurno();
		Assert.assertEquals(jugador1, ronda.obtenerJugadorActual());
	}
	
	@Test
	public void test02_JugadorArrojaDosDadosTienenElMismoValorDeVueltaNoVuelveAJugar() {
		Jugador jugador1 = new JugadorHumano(tablero, new Dinero(10000));
		Jugador jugador2 = new JugadorHumano(tablero, new Dinero(10000));
		Cubilete dados = new Cubilete();
		dados.agregar(new DadoCargado(2));
		dados.agregar(new DadoCargado(2));
		Ronda ronda = new Ronda(dados);
		ronda.agregarJugador(jugador1);
		ronda.agregarJugador(jugador2);
		dados.lanzar();
		ronda.avanzarTurno();
		dados.lanzar();
		ronda.avanzarTurno();
		Assert.assertNotEquals(jugador1, ronda.obtenerJugadorActual());
	}
	
	@Test
	public void test03_NOENTENDI() {
		
	}
	
	@Test
	public void test04_UnJugadorArrojaLosDadosAvanzaLoQueIndicanLosDados() {
		Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(5));
		cubilete.lanzar();
		jugador.avanzar(cubilete.sumarValores());
		Encasillable carcel = tablero.getFactory().getCarcel();
		Assert.assertEquals(carcel, jugador.obtenerCasilleroActual());
	}
	
	@Test(expected = NoHayMasMejorasException.class)
	public void test05_NoSePuedeConstruirHotelEnTerrenoSimple() {
		Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(11));
		jugador.avanzar(cubilete.sumarValores());
		jugador.comprarCasilleroActual();
		SantaFe santafe = (SantaFe) jugador.obtenerCasilleroActual();
		santafe.construir();
		santafe.construir();
		santafe.construir();
	}
	
	@Test
	public void test06_ElJugadorNoTienePropiedadesNiDineroQuedaFueraDeLaRonda() {
		Jugador jugador1 = new JugadorHumano(tablero, new Dinero(100000));
		Jugador jugador2 = new JugadorHumano(tablero, new Dinero(0));
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(5));
		cubilete.agregar(new DadoCargado(6));
		Ronda ronda = new Ronda(cubilete);
		ronda.agregarJugador(jugador1);
		ronda.agregarJugador(jugador2);
		Jugador jugador_actual = ronda.obtenerJugadorActual();
		cubilete.lanzar();
		jugador_actual.avanzar(cubilete.sumarValores());
		jugador_actual.aplicarEfectoDeCasilleroActual(cubilete);
		jugador_actual.comprarCasilleroActual();
		ronda.avanzarTurno();
		jugador_actual = ronda.obtenerJugadorActual();
		cubilete.lanzar();
		jugador_actual.avanzar(cubilete.sumarValores());
		try {
			jugador_actual.aplicarEfectoDeCasilleroActual(cubilete);
		}catch(BancaRotaException e) {
			ronda.quitarJugadorActual();
		}
		ArrayList<Jugador> jugadores = ronda.obtenerJugadores();
		ArrayList<Jugador> jugadores_esperados = new ArrayList<Jugador>();
		jugadores_esperados.add(jugador1);
		Assert.assertEquals(jugadores_esperados, jugadores);
	}
	
	@Test
	public void test06_ElJugadorNoTieneDineroVendePropiedadesPeroNoLeAlcanzaQuedaFueraDeLaRonda() {
		/*
		 * El jugador 1 tiene subte y tren, el jugador 2 tiene santafe y 0 de efectivo
		 * El jugador 2 saca 12 y cae en subte por lo que le tiene que pagar al jugador 1 12x1100 = 13200
		 * El jugador 2 vende santafe y recibe 15000x0.85 = 12750 por lo que no le alcanza para pagar
		 * El jugador 2 queda fuera de juego
		 */
		Jugador jugador1 = new JugadorHumano(tablero, new Dinero(100000));
		Jugador jugador2 = new JugadorHumano(tablero, new Dinero(15000));
		SantaFe santafe = (SantaFe) tablero.getFactory().getSantaFe();
		santafe.comprar(jugador2);
		Subte subte = (Subte) tablero.getFactory().getSubte();
		subte.comprar(jugador1);
		Tren tren = (Tren) tablero.getFactory().getTren();
		tren.comprar(jugador1);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(12));
		Ronda ronda = new Ronda(cubilete);
		ronda.agregarJugador(jugador1);
		ronda.agregarJugador(jugador2);
		ronda.avanzarTurno();
		ronda.avanzarTurno();
		Jugador jugador_actual = ronda.obtenerJugadorActual();
		cubilete.lanzar();
		jugador_actual.avanzar(8);
		try {
			jugador_actual.aplicarEfectoDeCasilleroActual(cubilete);
		}catch(BancaRotaException e) {
			santafe.vender();
			try {
				jugador_actual.aplicarEfectoDeCasilleroActual(cubilete);
			}catch(BancaRotaException f) {
				ronda.quitarJugadorActual();
			}
		}
		ArrayList<Jugador> jugadores = ronda.obtenerJugadores();
		ArrayList<Jugador> jugadores_esperados = new ArrayList<Jugador>();
		jugadores_esperados.add(jugador1);
		Assert.assertEquals(jugadores_esperados, jugadores);
	}
	
}
