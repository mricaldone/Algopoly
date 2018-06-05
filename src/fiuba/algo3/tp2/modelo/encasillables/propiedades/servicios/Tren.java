package fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios;

import fiuba.algo3.tp2.modelo.Dinero;

public class Tren extends Servicio {
	
	private static final int MULT_PENALIDAD = 450;
	private static final int MULT_PENALIDAD_CON_SUBTE = 800;
	private static final Dinero PRECIO_DE_COMPRA = new Dinero(38000);
	
	public Tren() {
		super(PRECIO_DE_COMPRA, MULT_PENALIDAD, MULT_PENALIDAD_CON_SUBTE);
	}
	
	@Override
	public String toString() {
		return "Tren";
	}
	@Override
	public boolean esPropiedad(){
		return true;
	}
}
