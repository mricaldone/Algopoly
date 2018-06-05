package fiuba.algo3.tp2.modelo;

import org.junit.Assert;

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
import fiuba.algo3.tp2.modelo.tablero.IterTablero;
import fiuba.algo3.tp2.modelo.tablero.Tablero;
import junit.framework.TestCase;

public class IterTableroTest extends TestCase {
	
	Tablero tablero = new Tablero();
	
	public void testSecuenciaDeIteracionAvanzar() {
		IterTablero iterador = tablero.crearIterador();
		Assert.assertTrue(iterador.verActual() instanceof Salida);
		Assert.assertTrue(iterador.avanzar() instanceof Quini6);
		Assert.assertTrue(iterador.avanzar() instanceof BuenosAiresSur);
		Assert.assertTrue(iterador.avanzar() instanceof Edesur);
		Assert.assertTrue(iterador.avanzar() instanceof BuenosAiresNorte);
		Assert.assertTrue(iterador.avanzar() instanceof Carcel);
		Assert.assertTrue(iterador.avanzar() instanceof CordobaSur);
		Assert.assertTrue(iterador.avanzar() instanceof AvanceDinamico);
		Assert.assertTrue(iterador.avanzar() instanceof Subte);
		Assert.assertTrue(iterador.avanzar() instanceof CordobaNorte);
		Assert.assertTrue(iterador.avanzar() instanceof ImpuestoDeLujo);
		Assert.assertTrue(iterador.avanzar() instanceof SantaFe);
		Assert.assertTrue(iterador.avanzar() instanceof Aysa);
		Assert.assertTrue(iterador.avanzar() instanceof SaltaNorte);
		Assert.assertTrue(iterador.avanzar() instanceof SaltaSur);
		Assert.assertTrue(iterador.avanzar() instanceof Policia);
		Assert.assertTrue(iterador.avanzar() instanceof Tren);
		Assert.assertTrue(iterador.avanzar() instanceof Neuquen);
		Assert.assertTrue(iterador.avanzar() instanceof RetrocesoDinamico);
		Assert.assertTrue(iterador.avanzar() instanceof Tucuman);
		Assert.assertTrue(iterador.avanzar() instanceof Salida);
	}
	
}
