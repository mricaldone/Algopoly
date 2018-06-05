package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.encasillables.RetrocesoDinamico;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Subte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Tren;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.CordobaNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Neuquen;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Tucuman;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class RetrocesoDinamicoTest{

	int posicionEnTableroDeRetrocesoDinamico = 18;
	Tablero tablero = new Tablero();
	Dinero dinero = new Dinero(100000);
	Jugador jugador = new JugadorHumano(tablero, dinero);
	Cubilete cubilete = new Cubilete();

	// Tests grupo [2,3,4,5,6]
	@Test
	public void test01unJugadorSinPropiedadesQueSaca2Retrocede2Lugares() throws Exception {
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 2));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(2));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof Tren);
	}

	@Test
	public void test02unJugadorCon1PropiedadQueSaca2Retrocede1Lugar() throws DineroInsuficienteException  {
		Propiedad comprable = new Tucuman();
		jugador.comprar(comprable);
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 2));
		jugador.avanzar(cubilete.sumarValores());
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(2));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof Neuquen);

	}

	@Test
	public void test03unJugadorCon3PropiedadesQueSaca2NoRetrocede() throws DineroInsuficienteException {
		
		Propiedad comprable1 = (Propiedad) tablero.getFactory().getTucuman();
		Propiedad comprable2 = (Propiedad) tablero.getFactory().getNeuquen();
		Propiedad comprable3 = (Propiedad) tablero.getFactory().getCordobaSur();
		jugador.comprar(comprable1);
		jugador.comprar(comprable2);
		jugador.comprar(comprable3);
		
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico-2));
		jugador.avanzar(cubilete.sumarValores()); 
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(2));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof RetrocesoDinamico);
	}

	// Tests grupo [7,8,9,10]

	@Test
	public void test05unJugadorCon100000EfectivoQueSaca10NoRetrocede() throws Exception {
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 10));
		jugador.avanzar(cubilete.sumarValores());
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(10));
		jugador.avanzar(cubilete.sumarValores());
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof RetrocesoDinamico);
	}

	@Test
	public void test06unJugadorCon100001EfectivoQueSaca10Retrocede1Lugar() throws Exception {
		jugador.cobrar(new Dinero(1));
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 10));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(10));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof Neuquen);
	}

	@Test
	public void test07unJugadorCon100002EfectivoQueSaca10Retrocede2Lugares() throws Exception {
		jugador.cobrar(new Dinero(2));
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 10));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(10));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof Tren);
	}

	@Test
	public void test08unJugadorCon100009EfectivoQueSaca10Retrocede9Lugares() throws Exception {
		jugador.cobrar(new Dinero(9));
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 10));
		jugador.avanzar(cubilete.sumarValores()); // Ahora est� a 10 lugares de
									// RetrocesoDin�mico
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(10));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof CordobaNorte);

	}

	// Tests grupo [11,12]

	@Test
	public void test09unJugadorQueSaca11Retrocede9Lugares() throws Exception {
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 11));
		jugador.avanzar(cubilete.sumarValores());
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(11));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();

		Assert.assertTrue(casillero instanceof CordobaNorte);
	}

	@Test
	public void test10unJugadorQueSaca12Retrocede10Lugares() throws Exception {
		cubilete.agregar(new DadoCargado(posicionEnTableroDeRetrocesoDinamico - 12));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(12));
		jugador.avanzar(cubilete.sumarValores());
		jugador.aplicarEfectoDeCasilleroActual(cubilete);
		Encasillable casillero = jugador.obtenerCasilleroActual();
		Assert.assertTrue(casillero instanceof Subte);

	}
}
