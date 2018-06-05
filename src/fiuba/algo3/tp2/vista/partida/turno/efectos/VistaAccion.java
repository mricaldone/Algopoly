package fiuba.algo3.tp2.vista.partida.turno.efectos;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public abstract class VistaAccion extends VBox {
	
	public VistaAccion(){
		this.getStyleClass().add("VistaTurnoDinamica");
	}

	public void setColorFondo(Color color_jugador) {
		this.setBackground(new Background(new BackgroundFill(color_jugador, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
}
