package fiuba.algo3.tp2.modelo.premios;

import fiuba.algo3.tp2.modelo.Dinero;

public interface EstadoPremio {

	public Dinero obtenerMonto();

	public EstadoPremio siguientePremio();

}
