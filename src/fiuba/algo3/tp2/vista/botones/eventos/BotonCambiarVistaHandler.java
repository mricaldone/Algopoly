package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.vista.partida.turno.efectos.VistaAccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonCambiarVistaHandler implements EventHandler<ActionEvent> {

	private VistaAccion vista;

	public BotonCambiarVistaHandler(VistaAccion vista) {
		this.vista = vista;
	}

	@Override
	public void handle(ActionEvent event) {
		//ControladorPrincipal.getInstance().cambiarVistaAccion(vista);
		ControladorPrincipal.getInstance().accionCambiarVista(vista);
	}

}
