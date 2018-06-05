package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonConfirmarIntercambioHandler implements EventHandler<ActionEvent> {

	Propiedad propiedad_propia;
	Propiedad propiedad_ajena;
	
	public BotonConfirmarIntercambioHandler(Propiedad propiedad_propia, Propiedad propiedad_ajena) {
		this.propiedad_propia = propiedad_propia;
		this.propiedad_ajena = propiedad_ajena;
	}

	@Override
	public void handle(ActionEvent arg0) {
		ControladorPrincipal.getInstance().accionIntercambiar(propiedad_propia, propiedad_ajena);
	}

}
