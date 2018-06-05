package fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios;

import fiuba.algo3.tp2.modelo.Dinero;

public class Subte extends Servicio {
	
	private static final int MULT_PENALIDAD = 600;
	private static final int MULT_PENALIDAD_CON_TREN = 1100;
	private static final Dinero PRECIO_DE_COMPRA = new Dinero(40000);
	
	public Subte() {
		super(PRECIO_DE_COMPRA, MULT_PENALIDAD, MULT_PENALIDAD_CON_TREN);
	}
	
	@Override
	public String toString() {
		return "Subte";
	}
	
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
