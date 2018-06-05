package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.cubilete.Lanzable;

public class DadoCargadoTest {

	private static final double DELTA = 1e-6;
	
	@Test
	public void testCrearUnDadoCargadoNoEsNull() {
		Lanzable dado = new DadoCargado(2);
		Assert.assertNotEquals(null, dado);
	}
	
	@Test
	public void testCrearUnDadoCargadoVectorNoEsNull() {
		Lanzable dado = new DadoCargado(new int[] {2});
		Assert.assertNotEquals(null, dado);
	}
	
	@Test
	public void testCrearUnDadoCargadoTieneUnEstadoValido() {
		Lanzable dado = new DadoCargado(6);
		Assert.assertEquals(6, dado.obtenerValor(), DELTA);
	}
	
	@Test
	public void testCrearUnDadoCargadoVectorTieneUnEstadoValido() {
		Lanzable dado = new DadoCargado(new int[] {6});
		Assert.assertEquals(6, dado.obtenerValor(), DELTA);
	}

	@Test
	public void testLanzarUnDadoCargadoCon2Saca2AlLanzarlo1000Veces() {
		Lanzable dado = new DadoCargado(2);
		for(int i = 0;i < 1000;i++) {
			dado.lanzar();
			Assert.assertEquals(2, dado.obtenerValor(), DELTA);
		}
	}
	
	@Test
	public void testLanzarUnDadoCargadoCon8Saca8AlLanzarlo1000Veces() {
		Lanzable dado = new DadoCargado(8);
		for(int i = 0;i < 1000;i++) {
			dado.lanzar();
			Assert.assertEquals(8, dado.obtenerValor(), DELTA);
		}
	}
	
	@Test
	public void testLanzarUnDadoCargadoConUnVectorSacaLaSecuenciaDelVector1000Veces() {
		int[] secuencia = new int[] {0,1,2,3,4,5,6,7,8,9};
		Lanzable dado = new DadoCargado(secuencia);
		for(int i = 0;i < 1000;i++) {
			dado.lanzar();
			Assert.assertEquals(i % secuencia.length, dado.obtenerValor(), DELTA);
		}
	}

}
