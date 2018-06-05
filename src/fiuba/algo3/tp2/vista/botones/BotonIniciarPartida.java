package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import fiuba.algo3.tp2.vista.botones.eventos.BotonIniciarPartidaHandler;
import fiuba.algo3.tp2.vista.pantallas.TextFieldNombres;

public class BotonIniciarPartida extends BotonAlgoPoly {

	//public BotonIniciarPartida(ContenedorPrincipal contenedorPadre,TextFieldNombres textFieldNombres,ControladorPrincipal controlador_principal){
	public BotonIniciarPartida(ContenedorPrincipal contenedorPadre,TextFieldNombres textFieldNombres){
		this.setText("Iniciar Partida");
		this.setOnAction(new BotonIniciarPartidaHandler(contenedorPadre,textFieldNombres));
	}
	
}
