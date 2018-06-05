package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionBaldio;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionCasa;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionDuplex;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionHotel;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;
import fiuba.algo3.tp2.modelo.tablero.Tablero;


public class TerrenoTest {
	
	private Tablero tablero = new Tablero();
	private Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
	private BuenosAiresNorte bsasnorte;
	private BuenosAiresSur bsassur;
	private SantaFe stafe;
	
	public TerrenoTest() throws DineroInsuficienteException {
		jugador.avanzar(2);
		jugador.comprarCasilleroActual();
		bsassur = (BuenosAiresSur) jugador.obtenerCasilleroActual();
		jugador.avanzar(2);
		jugador.comprarCasilleroActual();
		bsasnorte = (BuenosAiresNorte) jugador.obtenerCasilleroActual();
		jugador.avanzar(7);
		jugador.comprarCasilleroActual();
		stafe = (SantaFe) jugador.obtenerCasilleroActual();
		bsasnorte.construir();
		bsasnorte.construir();
	}
	
	/* TERRENOS DOBLES */
	
	@Test
	public void testEnBuenosAiresSurLaConstruccionEsBaldio() throws DineroInsuficienteException {
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionBaldio);
	}
	
	@Test
	public void testConstruirUnaVezEnBuenosAiresSurLaConstruccionEsCasa() throws DineroInsuficienteException {
		bsassur.construir();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionCasa);
	}
	
	@Test
	public void testConstruirDosVecesEnBuenosAiresSurConstruyeUnDuplex() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionDuplex);
	}
	
	@Test
	public void testConstruirTresVecesEnBuenosAiresSurLaConstruccionEsHotel() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		
		bsassur.construir();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionHotel);
	}
	
	@Test(expected=NoHayMasMejorasException.class)
	public void testConstruirCuatroVecesEnBuenosAiresSurLaLanzaNoHayMasMejoras() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
	}
	
	
	@Test
	public void testDemolerTresVecesEnBuenosAiresSurConHotelEsBaldio() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
		bsassur.demoler();
		bsassur.demoler();
		bsassur.demoler();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionBaldio);
	}
	
	@Test
	public void testDemolerDosVecesEnBuenosAiresSurConHotelEsCasa() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
		bsassur.demoler();
		bsassur.demoler();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionCasa);
	}
	
	@Test
	public void testDemolerUnaVezEnBuenosAiresSurConHotelEsDuplex() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
		bsassur.demoler();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionDuplex);
	}
	
	@Test
	public void testDemolerUnHotelEnBuenosAiresSurRecibe6800() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
		Dinero monto_inicial = jugador.obtenerDinero();
		bsassur.demoler();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(6800, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testDemolerUnDuplexEnBuenosAiresSurRecibe4250() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.construir();
		Dinero monto_inicial = jugador.obtenerDinero();
		bsassur.demoler();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(4250, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testDemolerUnaCasaEnBuenosAiresSurRecibe4250() throws DineroInsuficienteException {
		bsassur.construir();
		Dinero monto_inicial = jugador.obtenerDinero();
		bsassur.demoler();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(4250, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testDemolerBaldioEnBuenosAiresSurRecibe0() throws DineroInsuficienteException {
		Dinero monto_inicial = jugador.obtenerDinero();
		bsassur.demoler();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(0, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testVenderBuenosAiresSurRecibe26350() throws DineroInsuficienteException {
		Dinero monto_inicial = jugador.obtenerDinero();
		bsassur.vender();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(26350, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testVenderBuenosAiresSurConHotelRecibe41650() throws DineroInsuficienteException {
		//OBSERVACION: AL VENDER DEMUELE TODAS LAS CONSTRUCCIONES DE EL Y DE SU PAREJA
		bsassur.construir();
		bsassur.construir();
		bsassur.construir();
		Dinero monto_inicial = jugador.obtenerDinero();
		bsassur.vender();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(41650, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testVenderBuenosAiresSurYaNoTienePropietario() throws DineroInsuficienteException {
		bsassur.vender();
		Assert.assertTrue(bsassur.getPropietario() instanceof JugadorNull);
	}
	
	@Test
	public void testVenderBuenosAiresSurJugadorNoTieneLaPropiedad() throws DineroInsuficienteException {
		bsassur.vender();
		for(Propiedad propiedad:jugador.getPropiedades()) {
			Assert.assertFalse(propiedad instanceof BuenosAiresSur);
		}
	}
	
	@Test
	public void testVenderBuenosAiresSurYaNoTieneConstrucciones() throws DineroInsuficienteException {
		bsassur.construir();
		bsassur.vender();
		Assert.assertTrue(bsassur.getConstruccion() instanceof ConstruccionBaldio);
	}
	
	/* TERRENOS SIMPLES */
	
	@Test
	public void testEnSantaFeLaConstruccionEsBaldio() throws DineroInsuficienteException {
		Assert.assertTrue(stafe.getConstruccion() instanceof ConstruccionBaldio);
	}
	
	@Test
	public void testConstruirUnaVezEnSantaFeLaConstruccionEsCasa() throws DineroInsuficienteException {
		stafe.construir();
		Assert.assertTrue(stafe.getConstruccion() instanceof ConstruccionCasa);
	}
	
	@Test(expected = NoHayMasMejorasException.class)
	public void testConstruirDosVecesEnSantaFeLanzaNoHayMasMejoras() throws DineroInsuficienteException {
		stafe.construir();
		stafe.construir();
	}
	
	@Test
	public void testDemolerUnaVezEnSantaFeConCasaEsBaldio() throws DineroInsuficienteException {
		stafe.construir();
		stafe.demoler();
		Assert.assertTrue(stafe.getConstruccion() instanceof ConstruccionBaldio);
	}
	
	@Test
	public void testDemolerDosVecesEnSantaFeConCasaEsBaldio() throws DineroInsuficienteException {
		stafe.construir();
		stafe.demoler();
		stafe.demoler();
		Assert.assertTrue(stafe.getConstruccion() instanceof ConstruccionBaldio);
	}
	
	@Test
	public void testDemolerUnaCasaEnSantaFeRecibe3400() throws DineroInsuficienteException {
		stafe.construir();
		Dinero monto_inicial = jugador.obtenerDinero();
		stafe.demoler();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(3400, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testDemolerBaldioEnSantaFeRecibe0() throws DineroInsuficienteException {
		Dinero monto_inicial = jugador.obtenerDinero();
		stafe.demoler();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(0, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testVenderSantaFeRecibe12750() throws DineroInsuficienteException {
		Dinero monto_inicial = jugador.obtenerDinero();
		stafe.vender();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(12750, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testVenderSantaFeConCasaRecibe16150() throws DineroInsuficienteException {
		stafe.construir();
		Dinero monto_inicial = jugador.obtenerDinero();
		stafe.vender();
		Dinero monto_final = jugador.obtenerDinero();
		Assert.assertEquals(16150, monto_final.obtenerMontoEntero() - monto_inicial.obtenerMontoEntero());
	}
	
	@Test
	public void testVenderSantaFeYaNoTienePropietario() throws DineroInsuficienteException {
		stafe.vender();
		Assert.assertTrue(stafe.getPropietario() instanceof JugadorNull);
	}
	
	@Test
	public void testVenderSantaFeJugadorNoTieneLaPropiedad() throws DineroInsuficienteException {
		stafe.vender();
		for(Propiedad propiedad:jugador.getPropiedades()) {
			Assert.assertFalse(propiedad instanceof SantaFe);
		}
	}
	
	@Test
	public void testVenderSantaFeYaNoTieneConstrucciones() throws DineroInsuficienteException {
		stafe.construir();
		stafe.vender();
		Assert.assertTrue(stafe.getConstruccion() instanceof ConstruccionBaldio);
	}
	
}
