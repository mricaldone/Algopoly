package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonPagarAlquilerHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent arg0) {
		//ControladorPrincipal.getInstance().aplicar_efecto();
		//ControladorPrincipal.getInstance().terminar_turno();
		ControladorPrincipal.getInstance().accionAplicarEfecto();
	}

}