package fiuba.algo3.tp2.modelo;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;

public class Intercambio {
	
	Propiedad propiedad_propia; 
	Propiedad propiedad_ajena;

	public Intercambio(Propiedad propiedad_propia, Propiedad propiedad_ajena) {
		this.propiedad_propia = propiedad_propia;
		this.propiedad_ajena = propiedad_ajena;
	}

	public void aceptarIntercambio() {
		Jugador originario = this.propiedad_propia.getPropietario();
		Jugador destinatario = this.propiedad_ajena.getPropietario();
		
		originario.entregarPropiedad(destinatario, this.propiedad_propia);
		destinatario.entregarPropiedad(originario, this.propiedad_ajena);
	}

}
