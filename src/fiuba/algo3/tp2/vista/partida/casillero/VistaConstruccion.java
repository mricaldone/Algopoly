package fiuba.algo3.tp2.vista.partida.casillero;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class VistaConstruccion extends ImageView {

	public VistaConstruccion(String nombreImagen){
		this.setImage(new Image(nombreImagen));
		this.setFitHeight(44);
		this.setFitWidth(122);
	}
	
}
