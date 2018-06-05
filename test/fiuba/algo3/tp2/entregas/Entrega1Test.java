package fiuba.algo3.tp2.entregas;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorHumano;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.cubilete.Lanzable;
import fiuba.algo3.tp2.modelo.encasillables.Carcel;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Aysa;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Neuquen;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Tucuman;
import fiuba.algo3.tp2.modelo.excepciones.BancaRotaException;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class Entrega1Test {

	private Dinero dinero100k = new Dinero(100000);
	private Tablero tablero = new Tablero();
	private Jugador jugador100k = new JugadorHumano(tablero, dinero100k);

	@Test
	public void test01_ElCapitalSeIncrementaEn50000AlCaerEnQuini6PorPrimeraVez() throws Exception {
		Lanzable dado1 = new DadoCargado(7);
		Lanzable dado2 = new DadoCargado(14);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete);
		int monto_final = jugador100k.obtenerDinero().obtenerMontoEntero();
		int monto_esperado = new Dinero(150000).obtenerMontoEntero();
		Assert.assertEquals(monto_esperado, monto_final);
	}

	@Test
	public void test02_ElCapitalSeIncrementaEn30000AlCaerEnQuini6PorSegundaVez() throws Exception {
		Lanzable dado1 = new DadoCargado(7);
		Lanzable dado2 = new DadoCargado(14);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete);
		int monto_final = jugador100k.obtenerDinero().obtenerMontoEntero();
		int monto_esperado = new Dinero(150000).obtenerMontoEntero();
		Assert.assertEquals(monto_esperado, monto_final);

		Lanzable dado3 = new DadoCargado(7);
		Lanzable dado4 = new DadoCargado(13);
		Cubilete cubilete2 = new Cubilete();
		cubilete2.agregar(dado3);
		cubilete2.agregar(dado4);
		cubilete2.lanzar();
		jugador100k.avanzar(cubilete2.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete2);
		monto_final = jugador100k.obtenerDinero().obtenerMontoEntero();
		monto_esperado = new Dinero(180000).obtenerMontoEntero();
		Assert.assertEquals(monto_esperado, monto_final);

	}

	@Test
	public void test03_ElCapitalNoSeIncrementaAlCaerEnQuini6PorTerceraVez() throws Exception {
		Lanzable dado1 = new DadoCargado(7);
		Lanzable dado2 = new DadoCargado(14);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete);
		int monto_final = jugador100k.obtenerDinero().obtenerMontoEntero();
		int monto_esperado = new Dinero(150000).obtenerMontoEntero();
		Assert.assertEquals(monto_esperado, monto_final);

		Lanzable dado3 = new DadoCargado(7);
		Lanzable dado4 = new DadoCargado(13);
		Cubilete cubilete2 = new Cubilete();
		cubilete2.agregar(dado3);
		cubilete2.agregar(dado4);
		cubilete2.lanzar();
		jugador100k.avanzar(cubilete2.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete2);
		monto_final = jugador100k.obtenerDinero().obtenerMontoEntero();
		monto_esperado = new Dinero(180000).obtenerMontoEntero();
		Assert.assertEquals(monto_esperado, monto_final);

		Lanzable dado5 = new DadoCargado(7);
		Lanzable dado6 = new DadoCargado(13);
		Cubilete cubilete3 = new Cubilete();
		cubilete3.agregar(dado5);
		cubilete3.agregar(dado6);
		cubilete3.lanzar();
		jugador100k.avanzar(cubilete3.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete3);
		monto_final = jugador100k.obtenerDinero().obtenerMontoEntero();
		Assert.assertEquals(monto_esperado, monto_final);

	}

	@Test
	public void test04_ElJugadorCompraUnBarrio() throws DineroInsuficienteException {
		Propiedad comprable = new Tucuman();
		jugador100k.comprar(comprable);
		Assert.assertEquals(comprable.getPropietario(), jugador100k);
	}

	@Test
	public void test05_ElJugadorQueCaeEnLaCarcelNoPuedeMoverse() throws Exception {
		Lanzable dado1 = new DadoCargado(1);
		Lanzable dado2 = new DadoCargado(4);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero_esperado = jugador100k.obtenerCasilleroActual();
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();
		Assert.assertEquals(casillero_esperado, casillero_actual);
	}

	@Test
	public void test06_ElJugadorQuePagaLaFianzaPuedeMoverse() throws Exception {
		Lanzable dado1 = new DadoCargado(1);
		Lanzable dado2 = new DadoCargado(4);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		Encasillable casillero_carcel = jugador100k.obtenerCasilleroActual();
		jugador100k.avanzar(cubilete.sumarValores());
		jugador100k.pagarFianza();
		cubilete.lanzar();
		jugador100k.avanzar(cubilete.sumarValores());
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();
		Assert.assertNotEquals(casillero_carcel, casillero_actual);
	}

	@Test
	public void test07_ElJugadorQueNoPuedePagarLaFianzaPorFaltaDeFondosNoPuedeMoverse() throws Exception {
		Dinero dinero40k = new Dinero(40000);
		Jugador jugador40k = new JugadorHumano(tablero,dinero40k);

		Lanzable dado1 = new DadoCargado(2);
		Lanzable dado2 = new DadoCargado(3);
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		jugador40k.avanzar(cubilete.sumarValores());
		jugador40k.aplicarEfectoDeCasilleroActual(cubilete);
		jugador40k.avisarCambioDeTurno();
		jugador40k.avisarCambioDeTurno();
		try {
			jugador40k.pagarFianza();
		} catch (DineroInsuficienteException e) {
			// ESTO ES ESPERABLE PORQUE NO TIENE DINERO
		} catch (BancaRotaException e) {
			// ESTO ES ESPERABLE PORQUE NO TIENE DINERO
		}
		Encasillable casillero_esperado = jugador40k.obtenerCasilleroActual();
		cubilete.lanzar();
		jugador40k.avanzar(cubilete.sumarValores());
		Encasillable casillero_actual = jugador40k.obtenerCasilleroActual();
		Assert.assertEquals(casillero_esperado, casillero_actual);
	}

	@Test
	public void test08_ElJugadorQueCaeEnAvanceDinamicoHabiendoSacado6Avanza4Casilleros() throws DineroInsuficienteException {
		Cubilete cubilete_que_saca_1 = new Cubilete();
		cubilete_que_saca_1.agregar(new DadoCargado(1));
		Cubilete cubilete_que_saca_6 = new Cubilete();
		cubilete_que_saca_6.agregar(new DadoCargado(6));
		cubilete_que_saca_1.lanzar();
		jugador100k.avanzar(cubilete_que_saca_1.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete_que_saca_1);
		cubilete_que_saca_6.lanzar();
		jugador100k.avanzar(cubilete_que_saca_6.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete_que_saca_6);
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();

		Assert.assertTrue(casillero_actual instanceof SantaFe);
	}

	@Test
	public void test09_ElJugadorQueCaeEnAvanceDinamicoHabiendoSacado7Avanza5CasillerosSiSuCapitalEsDe100000() throws DineroInsuficienteException {
		Cubilete cubilete_que_saca_7 = new Cubilete();
		cubilete_que_saca_7.agregar(new DadoCargado(1));
		cubilete_que_saca_7.agregar(new DadoCargado(6));
		cubilete_que_saca_7.lanzar();
		jugador100k.avanzar(cubilete_que_saca_7.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete_que_saca_7);
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();

		Assert.assertTrue(casillero_actual instanceof Aysa);
	}

	@Test
	public void test10_ElJugadorQueCaeEnAvanceDinamicoHabiendoSacado12Avanza10CasillerosSiTiene2Propiedades()
			throws DineroInsuficienteException {

		jugador100k.comprar(new SantaFe());
		jugador100k.comprar(new Neuquen());
		Cubilete cubilete_que_saca_7 = new Cubilete();
		cubilete_que_saca_7.agregar(new DadoCargado(6));
		cubilete_que_saca_7.agregar(new DadoCargado(1));
		Cubilete cubilete_que_saca_12 = new Cubilete();
		cubilete_que_saca_12.agregar(new DadoCargado(6));
		cubilete_que_saca_12.agregar(new DadoCargado(6));
		cubilete_que_saca_7.lanzar();
		cubilete_que_saca_12.lanzar();
		jugador100k.avanzar(cubilete_que_saca_7.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete_que_saca_12);
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();

		Assert.assertTrue(casillero_actual instanceof Neuquen);
	}

	@Test
	public void test11_RetrocesoDinamico() {
		// tests en clase RetrocesoDinamicoTest
		Assert.assertTrue(true);
		;
	}

	@Test
	public void test12_ElJugadorQueCaeEnPoliciaVaALaCarcel()
			throws DineroInsuficienteException {
		Cubilete cubilete_que_saca_15 = new Cubilete();
		cubilete_que_saca_15.agregar(new DadoCargado(15));
		cubilete_que_saca_15.lanzar();
		jugador100k.avanzar(cubilete_que_saca_15.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete_que_saca_15);
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();
		Assert.assertTrue(casillero_actual instanceof Carcel);// <-- REVISAR
	}

	@Test
	public void test12_ElJugadorQueCaeEnPoliciaNoPuedeMoverse() throws Exception {
		Cubilete cubilete_que_saca_15 = new Cubilete();
		cubilete_que_saca_15.agregar(new DadoCargado(15));
		cubilete_que_saca_15.lanzar();
		jugador100k.avanzar(cubilete_que_saca_15.sumarValores());
		jugador100k.aplicarEfectoDeCasilleroActual(cubilete_que_saca_15);
		Encasillable casillero_esperado = jugador100k.obtenerCasilleroActual();
		jugador100k.avanzar(cubilete_que_saca_15.sumarValores());
		Encasillable casillero_actual = jugador100k.obtenerCasilleroActual();
		Assert.assertEquals(casillero_esperado, casillero_actual);
	}

}
