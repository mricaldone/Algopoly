package fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples;

import fiuba.algo3.tp2.modelo.Dinero;

public class SantaFe extends TerrenoSimple {

	private static final Dinero PRECIO_TERRENO = new Dinero(15000);
	private static final Dinero ALQUILER = new Dinero(1500);
	private static final Dinero ALQUILER_CON_1_CASA = new Dinero(3500);
	private static final Dinero COSTO_CONSTRUCCION_CASA = new Dinero(4000);
	
	public SantaFe() {
		super(PRECIO_TERRENO, ALQUILER, ALQUILER_CON_1_CASA, COSTO_CONSTRUCCION_CASA);
	}
	
	@Override
	public String toString() {
		return "Santa Fe";
	}
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
