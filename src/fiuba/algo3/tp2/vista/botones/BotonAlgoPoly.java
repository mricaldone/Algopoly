package fiuba.algo3.tp2.vista.botones;

import javafx.scene.control.Button;

public class BotonAlgoPoly extends Button{

	public BotonAlgoPoly(){
		this.getStyleClass().add("Boton");
	}
	
	public BotonAlgoPoly(String texto){
		this.getStyleClass().add("Boton");
		this.setText(texto);
	}
	
}
