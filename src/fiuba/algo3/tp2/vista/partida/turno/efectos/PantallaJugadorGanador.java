package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import fiuba.algo3.tp2.vista.botones.BotonReiniciarPartida;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PantallaJugadorGanador extends VBox {

	public PantallaJugadorGanador(ContenedorPrincipal stage, String ganador) {
		/* LOGO */
		Image logo = new Image("file:assets/logo.png");
		ImageView vistaImagen = new ImageView(logo);
		vistaImagen.setFitHeight(240);
		vistaImagen.setFitWidth(800);
		this.getChildren().add(vistaImagen);
		/* TEXTO */
		Label etiqueta = new Label();
		etiqueta.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
		etiqueta.setText("Gano " + ganador);
		etiqueta.setTextFill(Color.web("#FFFFFF"));
		this.getChildren().add(etiqueta);
		/* BOTON */
		this.getChildren().add(new BotonReiniciarPartida());

		this.getStyleClass().add("VistaInicial");
	}

}
