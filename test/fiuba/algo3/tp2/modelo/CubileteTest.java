package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.cubilete.DadoCubico;
import fiuba.algo3.tp2.modelo.cubilete.Lanzable;

public class CubileteTest {
	
	private static final double DELTA = 1e-6;
	
	//TESTEO PATRON SINGLETON DE CUBILETE
	
	@Test
	public void testCubileteGetInstanceSiempreDevuelveCubileteCreado(){
		Assert.assertNotEquals(null, new Cubilete());
	}
	
	//TESTEAMOS EL CUBILETE FALSO QUE SE COMPORTA EXACTAMENTE IGUAL QUE EL REAL, PERO SE PUEDE INSTANCIAR UNO NUEVO VACIO
	
	@Test
	public void testCubileteFalso() {
		Cubilete cubilete = new Cubilete();
		Assert.assertNotEquals(null, cubilete);
	}

	@Test
	public void testLanzarUnCubileteFalsoSinDadosObtiene0() {
		//TAL VEZ DEBERIA LANZAR UNA EXCEPCION
		Cubilete cubilete = new Cubilete();
		cubilete.lanzar();
		Assert.assertEquals(0, cubilete.sumarValores(), DELTA);
	}
	
	@Test
	public void testLanzarUnCubileteFalsoConUnDadoObtieneElValorDelDado() {
		Lanzable dado = new DadoCubico();
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado);
		cubilete.lanzar();
		Assert.assertEquals(dado.obtenerValor(), cubilete.sumarValores(), DELTA);
	}
	
	@Test
	public void testLanzarUnCubileteFalsoConDosDadosObtieneElValorDeLaSumaDeLosDosDados() {
		Lanzable dado1 = new DadoCubico();
		Lanzable dado2 = new DadoCubico();
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.lanzar();
		Assert.assertEquals(dado1.obtenerValor() + dado2.obtenerValor(), cubilete.sumarValores(), DELTA);
	}
	
	@Test
	public void testLanzarUnCubileteFalsoConTresDadosObtieneElValorDeLaSumaDeLosTresDados() {
		Lanzable dado1 = new DadoCubico();
		Lanzable dado2 = new DadoCubico();
		Lanzable dado3 = new DadoCubico();
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(dado1);
		cubilete.agregar(dado2);
		cubilete.agregar(dado3);
		cubilete.lanzar();
		Assert.assertEquals(dado1.obtenerValor() + dado2.obtenerValor() + dado3.obtenerValor(), cubilete.sumarValores(), DELTA);
	}
	
	@Test
	public void testLanzarUnCubileteConDosDoblesEsDoble() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(1));
		cubilete.agregar(new DadoCargado(1));
		Assert.assertTrue(cubilete.esDoble());
	}
	
	@Test
	public void testLanzarUnCubileteConDosDoblesNoEsDoble() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(5));
		cubilete.agregar(new DadoCargado(6));
		Assert.assertFalse(cubilete.esDoble());
	}
	
	@Test
	public void testLanzarUnCubileteConTresDoblesEsDoble() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(2));
		cubilete.agregar(new DadoCargado(2));
		cubilete.agregar(new DadoCargado(2));
		Assert.assertTrue(cubilete.esDoble());
	}
	
	@Test
	public void testLanzarUnCubileteConTresNoDoblesNoEsDoble() {
		Cubilete cubilete = new Cubilete();
		cubilete.agregar(new DadoCargado(2));
		cubilete.agregar(new DadoCargado(2));
		cubilete.agregar(new DadoCargado(3));
		Assert.assertFalse(cubilete.esDoble());
	}

}
