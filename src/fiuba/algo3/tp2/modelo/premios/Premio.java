package fiuba.algo3.tp2.modelo.premios;

import fiuba.algo3.tp2.modelo.Dinero;

public class Premio {
	
	private EstadoPremio estado;
	
	public Premio() {
		estado = new PrimerPremio();
	}
	
	public Dinero obtenerMonto() {
		return estado.obtenerMonto();
	}
	
	public void siguientePremio() {
		estado = estado.siguientePremio();
	}
	
}
