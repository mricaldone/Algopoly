package fiuba.algo3.tp2.vista.pantallas;

import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import fiuba.algo3.tp2.vista.botones.BotonAlgoPoly;
import fiuba.algo3.tp2.vista.botones.BotonIniciarPartida;
import javafx.scene.layout.VBox;

public class PantallaConfiguracionPartida extends VBox {

	private TextFieldNombres textFieldNombres;
	//private ControladorPrincipal controlador_principal;

	//public PantallaConfiguracionPartida(ContenedorPrincipal stage, ControladorPrincipal controlador_principal) {
	public PantallaConfiguracionPartida(ContenedorPrincipal stage) {	
		this.textFieldNombres=new TextFieldNombres();
		this.getChildren().addAll(this.textFieldNombres);
		agregarBotonIniciarPartida(stage);
		this.getStyleClass().add("VistaConfiguracionPartida");
		//this.controlador_principal = controlador_principal;
	}

	private void agregarBotonIniciarPartida(ContenedorPrincipal stage){
		//BotonAlgoPoly botonIniciarPartida = new BotonIniciarPartida(stage, textFieldNombres, controlador_principal);
		BotonAlgoPoly botonIniciarPartida = new BotonIniciarPartida(stage, textFieldNombres);
		this.getChildren().addAll(botonIniciarPartida);
	}


	


}
