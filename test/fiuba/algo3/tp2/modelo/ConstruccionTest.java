package fiuba.algo3.tp2.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.TerrenoDoble;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.TerrenoSimple;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;
import fiuba.algo3.tp2.modelo.tablero.Tablero;

public class ConstruccionTest {
	private Tablero tablero = new Tablero();
	private TerrenoSimple santaFe = new SantaFe();
	private TerrenoDoble bsAsSur = new BuenosAiresSur();
	private TerrenoDoble bsAsNorte = new BuenosAiresNorte();
	
	@Before
	public void setTerrenos(){
		bsAsSur.setPareja(bsAsNorte);
		bsAsNorte.setPareja(bsAsSur);
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test01ConstruirSoloSePermiteSiTienePropietario() throws DineroInsuficienteException {
		thrown.expect(DineroInsuficienteException.class);
		santaFe.construir();
	}
	
	@Test
	public void test02ConstruirConPropietarioYDineroSuficienteEstaOk() throws DineroInsuficienteException{
		Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
		jugador.comprar(santaFe);
		santaFe.construir();
	}
	
	@Test
	public void test03ConstruirConDineroInsuficienteLanzaExcepcion() throws DineroInsuficienteException{
		Jugador jugador = new JugadorHumano(tablero, new Dinero(santaFe.getPrecio().obtenerMontoEntero()));
		jugador.comprar(santaFe);
		thrown.expect(DineroInsuficienteException.class);
		santaFe.construir();
	}
	
	@Test
	public void test04ConstruirDescuentaValorDeLaPropiedad() throws DineroInsuficienteException{
		Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
		jugador.comprar(santaFe);
		NoHayMasMejorasException error = null;
		while(!(error==null)){
			try{
				int dineroAntes = jugador.obtenerDinero().obtenerMontoEntero();
				int costo = santaFe.getConstruccion().getPrecioMejora().obtenerMontoEntero();
				santaFe.construir();
				int dineroDespues = jugador.obtenerDinero().obtenerMontoEntero();
				Assert.assertEquals(dineroAntes - costo, dineroDespues);				
			}
			catch(NoHayMasMejorasException e){
				error = e;
			}
		}
	}
	/*
	@Test
	public void test05PropiedadesDobleSoloPermiteHotelSiSeTieneAmbasCompletasDeCasas() throws DineroInsuficienteException{
		Jugador jugador = new JugadorHumano(tablero, new Dinero(100000));
		jugador.comprar(bsAsNorte);
		jugador.comprar(bsAsSur);
		while(!(bsAsNorte.getConstruccion() instanceof ConstruccionNull)){
			bsAsNorte.construir();
		}
		//Una vez que llegue aca la siguiente construccion de bsAsNorte seria null por lo tanto compro todas las de bsAsSur y veo si cambia esto
		while(!(bsAsSur.getConstruccion() instanceof ConstruccionNull)){
			bsAsSur.construir();
		}
		Assert.assertFalse(bsAsNorte.getConstruccion() instanceof ConstruccionNull);
	}
	*/
}
