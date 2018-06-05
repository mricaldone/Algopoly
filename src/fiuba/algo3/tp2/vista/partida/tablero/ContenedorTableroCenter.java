package fiuba.algo3.tp2.vista.partida.tablero;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class ContenedorTableroCenter extends VBox{
	
	public ContenedorTableroCenter(){
		Image logo = new Image("file:assets/logo.png");
		ImageView vistaImagen = new ImageView(logo);
		vistaImagen.setFitHeight(120);
		vistaImagen.setFitWidth(400);
		this.getStyleClass().add("VistaTableroCentro");
		this.getChildren().add(vistaImagen);
	}

}
