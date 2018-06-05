package fiuba.algo3.tp2.vista.partida.turno;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VistaDado extends ImageView {

	public VistaDado(int numero){
		Image logo = new Image("file:assets/dados/dado"+numero+".png");
		this.setImage(logo);
		this.setFitHeight(100);
		this.setFitWidth(100);
	}
	
	

	
}
