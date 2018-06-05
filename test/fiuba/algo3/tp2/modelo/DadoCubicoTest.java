package fiuba.algo3.tp2.modelo;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.cubilete.DadoCubico;
import fiuba.algo3.tp2.modelo.cubilete.Lanzable;

public class DadoCubicoTest {

	@Test
	public void testCrearUnDadoCubicoNoEsNull() {
		Lanzable dado = new DadoCubico();
		Assert.assertNotEquals(null, dado);
	}
	
	@Test
	public void testCrearUnDadoCubicoTieneUnEstadoValido() {
		Lanzable dado = new DadoCubico();
		int valor_obtenido = dado.obtenerValor();
		if(valor_obtenido > 6) fail();
		if(valor_obtenido < 1) fail();
	}

	@Test
	public void testLanzarUnDadoCubico100000VecesSiempreDaUnValorEntre1y6() {
		Lanzable dado = new DadoCubico();
		for(int i = 0;i<100000;i++) {
			dado.lanzar();
			int valor_obtenido = dado.obtenerValor();
			if(valor_obtenido > 6) fail();
			if(valor_obtenido < 1) fail();
		}
	}

}
