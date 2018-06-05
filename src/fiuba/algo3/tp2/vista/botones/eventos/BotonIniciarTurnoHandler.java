package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonIniciarTurnoHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent arg0) {
		ControladorPrincipal.getInstance().accionIniciarTurno();
	}

}