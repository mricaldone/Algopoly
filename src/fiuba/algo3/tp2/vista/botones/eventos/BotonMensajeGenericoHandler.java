package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.vista.partida.turno.efectos.VistaAccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMensajeGenericoHandler implements EventHandler<ActionEvent> {
	
	VistaAccion vista_siguiente;
	
	public BotonMensajeGenericoHandler(VistaAccion vista_siguiente) {
		this.vista_siguiente = vista_siguiente;
	}
	
	@Override
	public void handle(ActionEvent event) {
		//ControladorPrincipal.getInstance().cambiarVistaAccion(vista_siguiente);
		ControladorPrincipal.getInstance().accionCambiarVista(vista_siguiente);
	}
	
}
