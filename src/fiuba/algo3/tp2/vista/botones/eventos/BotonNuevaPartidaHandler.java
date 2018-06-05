package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;

public class BotonNuevaPartidaHandler implements EventHandler<ActionEvent> {
	
	private ContenedorPrincipal stage;
	private Pane escenaConfigurarPartida;

	public BotonNuevaPartidaHandler(ContenedorPrincipal stage,Pane  escenaConfigurarPartida) {
		this.stage = stage;
		this.escenaConfigurarPartida = escenaConfigurarPartida;
	}

	@Override
	public void handle(ActionEvent event) {
		this.stage.cambiarVistaDinamica(this.escenaConfigurarPartida);
	}

}
