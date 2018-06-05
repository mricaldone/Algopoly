package fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples;

import fiuba.algo3.tp2.modelo.Dinero;

public class Tucuman extends TerrenoSimple {

	private static final Dinero PRECIO_TERRENO = new Dinero(25000);
	private static final Dinero ALQUILER = new Dinero(2500);
	private static final Dinero ALQUILER_CON_1_CASA = new Dinero(4500);
	private static final Dinero COSTO_CONSTRUCCION_CASA = new Dinero(7000);

	public Tucuman() {
		super(PRECIO_TERRENO, ALQUILER, ALQUILER_CON_1_CASA, COSTO_CONSTRUCCION_CASA);
	}

	@Override
	public String toString() {
		return "Tucuman";
	}
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
