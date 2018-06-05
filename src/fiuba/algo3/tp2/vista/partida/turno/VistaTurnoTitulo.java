package fiuba.algo3.tp2.vista.partida.turno;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class VistaTurnoTitulo extends Label{
	
	public VistaTurnoTitulo(String jugador_actual, Color color){
		this.getStyleClass().add("VistaTurnoTitulo");
		this.setText("Turno de: " + jugador_actual);
		this.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	
	
}
