package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.DadoCargado;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Neuquen;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class AvanceDinamicoTest {

	Tablero tablero = new Tablero();
	Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
	Cubilete cubilete_para_llegar_hasta_avance_dinamico = new Cubilete();
	private static final int cant_propiedades = 3;
	private static final int distancia_hasta_avance_dinamico = 7;
	
	@Before
	public void crearCubileteFalsoParaLlegarAAvanceDinamico(){
		cubilete_para_llegar_hasta_avance_dinamico.agregar(new DadoCargado(7));
	}

	@Test
	public void test01sacandoDe2A6SeAvanzaDosMenos() throws Exception {
		for(int i = 2; i<= 6; i++){
			//LLEVO AL JUGADOR HASTA AVANCE DINAMICO
			Jugador jugador1 = new JugadorHumano(tablero, new Dinero(100000));
			jugador1.avanzar(cubilete_para_llegar_hasta_avance_dinamico.sumarValores());
			Cubilete cubilete1 = new Cubilete();
			cubilete1.agregar(new DadoCargado(i));
			jugador1.aplicarEfectoDeCasilleroActual(cubilete1);
			//LLEVO AL JUGADOR 2 HASTA AVANCE DINAMICO + I
			Jugador jugador2 = new JugadorHumano(tablero, new Dinero(100000));
			Cubilete cubilete2 = new Cubilete();
			int distancia_esperada = distancia_hasta_avance_dinamico  + i - 2;
			cubilete2.agregar(new DadoCargado(distancia_esperada));
			cubilete2.lanzar();
			jugador2.avanzar(cubilete2.sumarValores());
			//VERIFICO QUE AMBOS ESTAN EN EL MISMO LUGAR
			Assert.assertEquals(jugador2.obtenerCasilleroActual(), jugador1.obtenerCasilleroActual());			
		}
		
	}

	@Test
	public void test02sacandoDe7A10SeAvanzaLaCantidadDineroDelJugadorDivididoLosDados() throws Exception{
		for(int i = 7; i<= 10; i++){
			//LLEVO AL JUGADOR HASTA AVANCE DINAMICO
			Jugador jugador1 = new JugadorHumano(tablero, new Dinero(100000));
			jugador1.avanzar(cubilete_para_llegar_hasta_avance_dinamico.sumarValores());
			Cubilete cubilete1 = new Cubilete();
			cubilete1.agregar(new DadoCargado(i));
			jugador1.aplicarEfectoDeCasilleroActual(cubilete1);
			//LLEVO AL JUGADOR 2 HASTA AVANCE DINAMICO + PLATA % I
			Jugador jugador2 = new JugadorHumano(tablero, new Dinero(100000));
			Cubilete cubilete2 = new Cubilete();
			int distancia_esperada = distancia_hasta_avance_dinamico + jugador1.obtenerDinero().obtenerMontoEntero() % i;
			cubilete2.agregar(new DadoCargado(distancia_esperada));
			cubilete2.lanzar();
			jugador2.avanzar(cubilete2.sumarValores());
			//VERIFICO QUE AMBOS ESTAN EN EL MISMO LUGAR
			Assert.assertEquals(jugador2.obtenerCasilleroActual(), jugador1.obtenerCasilleroActual());			
		}
		
	}

	@Test
	public void test03sacandoDe11A12SeAvanzaElNumeroMenosCantidadDePropiedades() throws Exception {

		for(int i = 11; i <= 12; i++){
			//LLEVO AL JUGADOR HASTA AVANCE DINAMICO
			Jugador jugador1 = new JugadorHumano(tablero, new Dinero(100000));
			for(int j = 1; j <= cant_propiedades; j++){
				jugador1.comprar(new Neuquen());
			}
			jugador1.avanzar(cubilete_para_llegar_hasta_avance_dinamico.sumarValores());
			Cubilete cubilete1 = new Cubilete();
			cubilete1.agregar(new DadoCargado(i));
			jugador1.aplicarEfectoDeCasilleroActual(cubilete1);
			//LLEVO AL JUGADOR 2 HASTA AVANCE DINAMICO + I - CANT_PROP
			Jugador jugador2 = new JugadorHumano(tablero, new Dinero(100000));
			Cubilete cubilete2 = new Cubilete();
			int distancia_esperada = distancia_hasta_avance_dinamico + i - jugador1.getCantidadDePropiedades();
			cubilete2.agregar(new DadoCargado(distancia_esperada));
			cubilete2.lanzar();
			jugador2.avanzar(cubilete2.sumarValores());
			//VERIFICO QUE AMBOS ESTAN EN EL MISMO LUGAR
			Assert.assertEquals(jugador2.obtenerCasilleroActual(), jugador1.obtenerCasilleroActual());			
		}
		
	}
}
