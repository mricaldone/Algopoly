package fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import fiuba.algo3.tp2.modelo.excepciones.FaltanCasasException;
import fiuba.algo3.tp2.modelo.excepciones.NoHayConstruccionesParaDemoler;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;


public abstract class Construccion {

	protected Construccion mejora_anterior;
	protected Construccion proxima_mejora;
	protected Dinero precio_alquiler;
	protected Dinero precio_construccion;
	
	public Dinero getAlquiler() {
		return precio_alquiler;
	}
	
	public Dinero getPrecioMejora() {
		return this.construirMejora().getPrecioConstruccion();
	}
	
	public Dinero getPrecioConstruccion() {
		return precio_construccion;
	}
	
	public Construccion construirMejora(Terreno actual, Terreno pareja) {
		actual.quiereContruir(pareja); // <-- SALTA EXCEPCION SI EL DUEÑO NO ES EL MISMO
		return this.construirMejora(); // <-- SALTA EXCEPCION SI NO HAY MAS MEJORAS
	}
	
	public Construccion construirMejora() {
		if(proxima_mejora instanceof ConstruccionNull)
			throw new NoHayMasMejorasException();
		return proxima_mejora;
	}
	
	public void parejaQuiereConstruirHotel() throws FaltanCasasException {
		throw new FaltanCasasException();
	}
	
	public Construccion demoler() throws NoHayConstruccionesParaDemoler {
		return mejora_anterior;
	}
	
	public void setMejora(Construccion prox) {
		proxima_mejora = prox;
	}

	public Dinero getPrecioDemolicion() {
		return precio_construccion;
	}
}
