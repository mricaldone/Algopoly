package fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples;

import fiuba.algo3.tp2.modelo.Dinero;

public class Neuquen extends TerrenoSimple {
	
	private static final Dinero PRECIO_TERRENO = new Dinero(17000);
	private static final Dinero ALQUILER = new Dinero(1800);
	private static final Dinero ALQUILER_CON_1_CASA = new Dinero(3800);
	private static final Dinero COSTO_CONSTRUCCION_CASA = new Dinero(4800);
	
	public Neuquen() {
		super(PRECIO_TERRENO, ALQUILER, ALQUILER_CON_1_CASA, COSTO_CONSTRUCCION_CASA);
	}
	
	@Override
	public String toString() {
		return "Neuquen";
	}
	
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
