package fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import fiuba.algo3.tp2.modelo.excepciones.NoHayConstruccionesParaDemoler;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;


public class ConstruccionNull extends Construccion {

	public ConstruccionNull() {
		this.precio_alquiler = new Dinero(0);
		this.precio_construccion = new Dinero(0);
	}

	@Override
	public Dinero getPrecioMejora() {
		throw new NoHayMasMejorasException();
	}

	@Override
	public Dinero getPrecioConstruccion() {
		return new Dinero(0);
	}

	@Override
	public Construccion construirMejora(Terreno actual, Terreno pareja) {
		throw new NoHayMasMejorasException();
	}

	@Override
	public Construccion demoler() throws NoHayConstruccionesParaDemoler {
		return this;
	}

	@Override
	public void setMejora(Construccion prox) {
	}

	@Override
	public Dinero getPrecioDemolicion() {
		return new Dinero(0);
	}

}
