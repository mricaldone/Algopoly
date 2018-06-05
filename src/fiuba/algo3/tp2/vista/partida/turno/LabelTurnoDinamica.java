package fiuba.algo3.tp2.vista.partida.turno;

import javafx.scene.control.Label;

public class LabelTurnoDinamica extends Label{

	public LabelTurnoDinamica(String texto){
		this.getStyleClass().add("LabelTurnoDinamica");
		this.setText(texto);
	}
	
}
