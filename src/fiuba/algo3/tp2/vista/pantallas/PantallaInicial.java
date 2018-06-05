package fiuba.algo3.tp2.vista.pantallas;

import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import fiuba.algo3.tp2.vista.botones.BotonAlgoPoly;
import fiuba.algo3.tp2.vista.botones.eventos.BotonNuevaPartidaHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class PantallaInicial extends VBox {
	
		public PantallaInicial(ContenedorPrincipal stage) {
		Image logo = new Image("file:assets/logo.png");
		ImageView vistaImagen = new ImageView(logo);
		vistaImagen.setFitHeight(240);
		vistaImagen.setFitWidth(800);
		this.getChildren().add(vistaImagen);
		agregarBotonNuevaPartida(stage);
		this.getStyleClass().add("VistaInicial");
	}
	
	private void agregarBotonNuevaPartida(ContenedorPrincipal stage){	
		PantallaConfiguracionPartida vistaConfiguracionPartida= new PantallaConfiguracionPartida(stage);
		BotonAlgoPoly botonNuevaPartida = new BotonAlgoPoly("Nueva Partida");
		botonNuevaPartida.setOnAction(new BotonNuevaPartidaHandler(stage,vistaConfiguracionPartida));
		this.getChildren().add(botonNuevaPartida);
	}
	
}
