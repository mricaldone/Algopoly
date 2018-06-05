package fiuba.algo3.tp2.vista.botones.eventos;

import java.util.ArrayList;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import fiuba.algo3.tp2.vista.pantallas.TextFieldNombres;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonIniciarPartidaHandler implements EventHandler<ActionEvent> {

	private ContenedorPrincipal stage;
	private TextFieldNombres textFieldNombres;
	private ControladorPrincipal controlador_principal = ControladorPrincipal.getInstance();
	
	public BotonIniciarPartidaHandler(ContenedorPrincipal stage, TextFieldNombres textFieldNombres) {
		this.textFieldNombres = textFieldNombres;
		this.stage = stage;
		//this.controlador_principal = controlador_principal;
	}

	@Override
	public void handle(ActionEvent event) {
		ArrayList<String> nombres = this.textFieldNombres.getNombres();
		//controlador_principal = new ControladorPrincipal();
		controlador_principal.agregarJugadores(nombres);
		controlador_principal.iniciar_partida(this.stage);
	}

}
