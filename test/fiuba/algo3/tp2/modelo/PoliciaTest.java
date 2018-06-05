package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.encasillables.Carcel;
import fiuba.algo3.tp2.modelo.encasillables.Policia;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class PoliciaTest {

	
	Policia policia;
	Jugador jugador;
	Carcel carcel;
	
	@Before
	public void inicializar(){
		Tablero tablero = new Tablero();
		carcel = (Carcel) tablero.getFactory().getCarcel();
		policia = new Policia(carcel);
		jugador = new JugadorHumano(tablero, new Dinero(10000));
	}
	
	@Test
	public void test01JugadorQueCaeEnPoliciaVaALaCarcel() throws DineroInsuficienteException{
		policia.aplicarEfecto(jugador, null);

		Assert.assertEquals(carcel, jugador.obtenerCasilleroActual());
	}
}
