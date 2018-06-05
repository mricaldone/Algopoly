package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRetrocesoDinamicoHandler implements EventHandler<ActionEvent> {

	private int cant_casilleros;
	
	public BotonRetrocesoDinamicoHandler(int cant_casilleros) {
		this.cant_casilleros = cant_casilleros;
	}

	@Override
	public void handle(ActionEvent event) {
		//ControladorPrincipal.getInstance().retroceder(cant_casilleros);
		ControladorPrincipal.getInstance().accionRetrocesoDinamico(cant_casilleros);
	}

}
