package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionBaldio;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class IntercambioTest {
	private Tablero tablero = new Tablero();
	private Jugador jugador1 = new JugadorHumano(tablero, new Dinero(100000));
	private Jugador jugador2 = new JugadorHumano(tablero, new Dinero(100000));
	private BuenosAiresSur bsassur;
	private BuenosAiresNorte bsasnorte;
	private SantaFe santafe;

	public IntercambioTest() {
		jugador1.avanzar(2);
		bsassur = (BuenosAiresSur) jugador1.obtenerCasilleroActual();
		jugador1.comprarCasilleroActual();
		jugador1.avanzar(2);
		bsasnorte = (BuenosAiresNorte) jugador1.obtenerCasilleroActual();
		jugador1.comprarCasilleroActual();
		bsassur.construir();
		bsassur.construir();
		bsasnorte.construir();
		bsasnorte.construir();
		bsassur.construir();
		bsasnorte.construir();
		
		jugador2.avanzar(11);
		santafe = (SantaFe) jugador2.obtenerCasilleroActual();
		jugador2.comprarCasilleroActual();
		santafe.construir();
	}
	
	@Test
	public void testJugador1IntercambiaBsAsSurPorSantaFeJugador2EsPropietarioDeBuenosAiresSur() {
		Intercambio intercambio = new Intercambio(bsassur, santafe);
		intercambio.aceptarIntercambio();
		Assert.assertEquals(jugador2, bsassur.getPropietario());
	}
	
	@Test
	public void testJugador1IntercambiaBsAsSurPorSantaFeJugador1EsPropietarioDeSantaFe() {
		Intercambio intercambio = new Intercambio(bsassur, santafe);
		intercambio.aceptarIntercambio();
		Assert.assertEquals(jugador1, santafe.getPropietario());
	}
	
	@Test
	public void testJugador1NoIntercambiaBsAsSurPorSantaFeJugador1EsPropietarioDeBsAsSur() {
		new Intercambio(bsassur, santafe);
		Assert.assertEquals(jugador1, bsassur.getPropietario());
	}
	
	@Test
	public void testJugador1NoIntercambiaBsAsSurPorSantaFeJugador2EsPropietarioDeSantaFe() {
		new Intercambio(bsassur, santafe);
		Assert.assertEquals(jugador2, santafe.getPropietario());
	}
	
	@Test
	public void testJugador1IntercambiaBsAsSurPorSantaFeBuenosAiresSurNoTieneConstrucciones() {
		Intercambio intercambio = new Intercambio(bsassur, santafe);
		intercambio.aceptarIntercambio();
		Assert.assertEquals(ConstruccionBaldio.class, bsassur.getConstruccion().getClass());
	}
	
	@Test
	public void testJugador1IntercambiaBsAsSurPorSantaFeBuenosAiresNorteNoTieneConstrucciones() {
		Intercambio intercambio = new Intercambio(bsassur, santafe);
		intercambio.aceptarIntercambio();
		Assert.assertEquals(ConstruccionBaldio.class, bsasnorte.getConstruccion().getClass());
	}
	
	@Test
	public void testJugador1IntercambiaBsAsSurPorSantaFeSantaFeNoTieneConstrucciones() {
		Intercambio intercambio = new Intercambio(bsassur, santafe);
		intercambio.aceptarIntercambio();
		Assert.assertEquals(ConstruccionBaldio.class, santafe.getConstruccion().getClass());
	}
	
}
