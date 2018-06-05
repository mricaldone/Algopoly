package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.AvanceDinamico;
import fiuba.algo3.tp2.modelo.encasillables.Carcel;
import fiuba.algo3.tp2.modelo.encasillables.ImpuestoDeLujo;
import fiuba.algo3.tp2.modelo.encasillables.Policia;
import fiuba.algo3.tp2.modelo.encasillables.Quini6;
import fiuba.algo3.tp2.modelo.encasillables.RetrocesoDinamico;
import fiuba.algo3.tp2.modelo.encasillables.Salida;
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
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.IterTablero;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class TableroTest {

	@Test
	public void testCrearIteradorNoEsNulo() {
		Tablero tablero = new Tablero();
		IterTablero iterador = tablero.crearIterador();
		Assert.assertNotNull(iterador);
	}
	
	@Test
	public void testCrearIteradorTieneLaSecuenciaCorrectaDeCasilleros() {
		Tablero tablero = new Tablero();
		IterTablero iterador = tablero.crearIterador();
		ArrayList<Encasillable> casilleros = new ArrayList<Encasillable>();
		for(int i = 0; i < 20; i++) {
			casilleros.add(iterador.verActual());
			iterador.avanzar();
		}
		Assert.assertTrue(casilleros.get(0) instanceof Salida);
		Assert.assertTrue(casilleros.get(1) instanceof Quini6);
		Assert.assertTrue(casilleros.get(2) instanceof BuenosAiresSur);
		Assert.assertTrue(casilleros.get(3) instanceof Edesur);
		Assert.assertTrue(casilleros.get(4) instanceof BuenosAiresNorte);
		Assert.assertTrue(casilleros.get(5) instanceof Carcel);
		Assert.assertTrue(casilleros.get(6) instanceof CordobaSur);
		Assert.assertTrue(casilleros.get(7) instanceof AvanceDinamico);
		Assert.assertTrue(casilleros.get(8) instanceof Subte);
		Assert.assertTrue(casilleros.get(9) instanceof CordobaNorte);
		Assert.assertTrue(casilleros.get(10) instanceof ImpuestoDeLujo);
		Assert.assertTrue(casilleros.get(11) instanceof SantaFe);
		Assert.assertTrue(casilleros.get(12) instanceof Aysa);
		Assert.assertTrue(casilleros.get(13) instanceof SaltaNorte);
		Assert.assertTrue(casilleros.get(14) instanceof SaltaSur);
		Assert.assertTrue(casilleros.get(15) instanceof Policia);
		Assert.assertTrue(casilleros.get(16) instanceof Tren);
		Assert.assertTrue(casilleros.get(17) instanceof Neuquen);
		Assert.assertTrue(casilleros.get(18) instanceof RetrocesoDinamico);
		Assert.assertTrue(casilleros.get(19) instanceof Tucuman);
	}

	@Test
	public void testTableroAlgoPolyNoEsNuloAlCrear() {
		Tablero tablero = new Tablero();
		Assert.assertNotNull(tablero);
	}

}
