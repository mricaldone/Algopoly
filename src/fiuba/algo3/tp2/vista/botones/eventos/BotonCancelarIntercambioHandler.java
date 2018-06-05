package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonCancelarIntercambioHandler implements EventHandler<ActionEvent> {

	Propiedad propiedad_propia;
	
	public BotonCancelarIntercambioHandler(Propiedad propiedad_propia) {
		this.propiedad_propia = propiedad_propia;
	}

	@Override
	public void handle(ActionEvent arg0) {
		ControladorPrincipal.getInstance().accionCancelarIntercambio(propiedad_propia);
	}

}
