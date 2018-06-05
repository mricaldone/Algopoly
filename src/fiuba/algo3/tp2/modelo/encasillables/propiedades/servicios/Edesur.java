package fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios;

import fiuba.algo3.tp2.modelo.Dinero;

public class Edesur extends Servicio {
	
	private static final int MULT_PENALIDAD = 500;
	private static final int MULT_PENALIDAD_CON_AYSA = 1000;
	private static final Dinero PRECIO_DE_COMPRA = new Dinero(35000);
	
	public Edesur() {
		super(PRECIO_DE_COMPRA, MULT_PENALIDAD, MULT_PENALIDAD_CON_AYSA);
	}
	
	@Override
	public String toString() {
		return "EDESUR";
	}
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
