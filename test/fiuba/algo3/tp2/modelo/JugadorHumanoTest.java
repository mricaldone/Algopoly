package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.AvanceDinamico;
import fiuba.algo3.tp2.modelo.encasillables.Carcel;
import fiuba.algo3.tp2.modelo.encasillables.ImpuestoDeLujo;
import fiuba.algo3.tp2.modelo.encasillables.Policia;
import fiuba.algo3.tp2.modelo.encasillables.Quini6;
import fiuba.algo3.tp2.modelo.encasillables.RetrocesoDinamico;
import fiuba.algo3.tp2.modelo.encasillables.Salida;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Aysa;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Edesur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Subte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Tren;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.CordobaNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.CordobaSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.SaltaNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.SaltaSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Neuquen;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Tucuman;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class JugadorHumanoTest {

	Tablero tablero = new Tablero();

	Dinero dinero100k = new Dinero(100000);
	Dinero dinero50k = new Dinero(50000);
	
	Propiedad comprable = new Tucuman();

	Jugador jugador100k = new JugadorHumano(tablero, dinero100k);

	@Test
	public void testAlCrearCon100kObtenerDineroDevuelve100k() {
		Assert.assertEquals(jugador100k.obtenerDinero().obtenerMontoEntero(), dinero100k.obtenerMontoEntero());
	}

	@Test
	public void testObtenerDineroDevuelveUnaCopia() throws DineroInsuficienteException {
		Dinero dinero = jugador100k.obtenerDinero();
		dinero.disminuirCantidad(dinero50k);
		Assert.assertEquals(jugador100k.obtenerDinero().obtenerMontoEntero(), dinero100k.obtenerMontoEntero());
	}

	@Test
	public void testInicialmenteGetCantidadDePropiedadesDevuelve0() {
		Assert.assertEquals(jugador100k.getCantidadDePropiedades(), 0);
	}

	@Test
	public void testAlComprarLaPrimerPropiedadGetCantidadDePropiedadesDevuelve1() throws DineroInsuficienteException {
		jugador100k.comprar(comprable);
		Assert.assertEquals(jugador100k.getCantidadDePropiedades(), 1);
	}

	@Test
	public void testSiAumentoCapitalGetDineroDevuelveLaSuma(){
		jugador100k.cobrar(dinero50k);
		Assert.assertEquals(jugador100k.obtenerDinero().obtenerMontoEntero(),150000);
	}
	
	@Test
	public void testRecorrerTablero() {
		Jugador jugador = new JugadorHumano(tablero, new Dinero(10000));
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Salida);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Quini6);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof BuenosAiresSur);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Edesur);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof BuenosAiresNorte);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Carcel);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof CordobaSur);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof AvanceDinamico);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Subte);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof CordobaNorte);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof ImpuestoDeLujo);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof SantaFe);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Aysa);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof SaltaNorte);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof SaltaSur);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Policia);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Tren);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Neuquen);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof RetrocesoDinamico);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Tucuman);
		jugador.avanzar(1);
		Assert.assertTrue(jugador.obtenerCasilleroActual() instanceof Salida);
		
	}
	
}