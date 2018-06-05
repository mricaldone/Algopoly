package fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles;

import fiuba.algo3.tp2.modelo.Dinero;

public class BuenosAiresSur extends TerrenoDoble {

	private static final Dinero PRECIO_TERRENO = new Dinero(20000);
	private static final Dinero ALQUILER = new Dinero(2000);
	private static final Dinero ALQUILER_CON_1_CASA = new Dinero(3000);
	private static final Dinero ALQUILER_CON_2_CASAS = new Dinero(3500);
	private static final Dinero ALQUILER_CON_HOTEL = new Dinero(5000);
	private static final Dinero COSTO_CONSTRUCCION_CASA = new Dinero(5000);
	private static final Dinero COSTO_CONSTRUCCION_HOTEL = new Dinero(8000);
	
	public BuenosAiresSur() {
		super(PRECIO_TERRENO, ALQUILER, ALQUILER_CON_1_CASA, ALQUILER_CON_2_CASAS, ALQUILER_CON_HOTEL, COSTO_CONSTRUCCION_CASA, COSTO_CONSTRUCCION_HOTEL);
	}
	@Override
	public String toString() {
		return "Bs. As. Sur";
	}
	
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
