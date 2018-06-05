package fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles;

import fiuba.algo3.tp2.modelo.Dinero;

public class SaltaNorte extends TerrenoDoble {
	
	private static final Dinero PRECIO_TERRENO = new Dinero(23000);
	private static final Dinero ALQUILER = new Dinero(2000);
	private static final Dinero ALQUILER_CON_1_CASA = new Dinero(3250);
	private static final Dinero ALQUILER_CON_2_CASAS = new Dinero(3850);
	private static final Dinero ALQUILER_CON_HOTEL = new Dinero(5500);
	private static final Dinero COSTO_CONSTRUCCION_CASA = new Dinero(4500);
	private static final Dinero COSTO_CONSTRUCCION_HOTEL = new Dinero(7500);
	
	public SaltaNorte() {
		super(PRECIO_TERRENO, ALQUILER, ALQUILER_CON_1_CASA, ALQUILER_CON_2_CASAS, ALQUILER_CON_HOTEL, COSTO_CONSTRUCCION_CASA, COSTO_CONSTRUCCION_HOTEL);
	}
	@Override
	public String toString() {
		return "Salta Norte";
	}
	
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
