package fiuba.algo3.tp2.vista.partida.casillero;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class VistaCasilleroNombre extends Label{

	public VistaCasilleroNombre(String nombre,Color color){
		this.getStyleClass().add("VistaCasilleroNombre");
		this.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setText(nombre);
	}
}
