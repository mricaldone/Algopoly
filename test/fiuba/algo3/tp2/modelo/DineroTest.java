package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.DineroNegativoException;

public class DineroTest {
	Dinero dinero100 = new Dinero(100);
	Dinero dinero120 = new Dinero(120);
	Dinero dinero0 = new Dinero(0);

	@Test
	public void siCreoConParametro100GetCantidadDevuelve100() {
		Assert.assertEquals(dinero100.obtenerMontoEntero(), 100);
	}

	@Test
	public void siCreoConParamentroCeroGetCantidadDevuelve0() {
		Assert.assertEquals(dinero0.obtenerMontoEntero(), 0);
	}
	
	@Test
	public void siADinero100LeSumoDinero120GetCantidadADinero100Devuelve220(){
		dinero100.aumentarCantidad(dinero120);
		Assert.assertEquals(dinero100.obtenerMontoEntero(), 220);
	}

	@Test
	public void siADinero100LeSumoDinero120GetCantidadADinero120Devuelve120(){
		dinero100.aumentarCantidad(dinero120);
		Assert.assertEquals(dinero120.obtenerMontoEntero(), 120);
	}
	
	@Test(expected = DineroNegativoException.class)
	public void crearConParametroNegativoLanzaExcepcion() {
		new Dinero(-10);
	}

	@Test(expected = DineroInsuficienteException.class)
	public void disminuirCantidadLanzaExcepcionSiQuedaraNegativo() throws DineroInsuficienteException {
		dinero100.disminuirCantidad(dinero120);
	}

	@Test
	public void disminuirCantidadNoSeModificaSiQuedaraNegativo() {
		try {
			dinero100.disminuirCantidad(dinero120);
		} catch (DineroInsuficienteException e) {

		} finally {
			Assert.assertEquals(dinero100.obtenerMontoEntero(), 100);
		}
	}
}
