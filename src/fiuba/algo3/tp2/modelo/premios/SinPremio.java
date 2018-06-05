package fiuba.algo3.tp2.modelo.premios;

import fiuba.algo3.tp2.modelo.Dinero;

public class SinPremio implements EstadoPremio {

	private static final Dinero monto = new Dinero(0);
	
	@Override
	public Dinero obtenerMonto() {
		return monto;
	}

	@Override
	public EstadoPremio siguientePremio() {
		return this;
	}
	
}
