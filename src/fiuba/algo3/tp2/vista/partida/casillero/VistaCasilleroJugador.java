package fiuba.algo3.tp2.vista.partida.casillero;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class VistaCasilleroJugador extends BorderPane {

	private Circle circulo;

	public VistaCasilleroJugador() {
		this.getStyleClass().add("VistaCasilleroJugador");
		this.circulo = crearCirculoVacio();
		this.setCenter(circulo);
	}

	public VistaCasilleroJugador(Color color) {
		this.getStyleClass().add("VistaCasilleroJugador");
		this.circulo = crearCirculoVacio();
		this.setCenter(circulo);
		this.circulo.setFill(color);
		this.circulo.setStroke(Color.TRANSPARENT);
	}

	private Circle crearCirculoVacio() {
		Circle circulo = new Circle();
		circulo.setRadius(10);
		circulo.setStroke(Color.TRANSPARENT);
		circulo.setFill(Color.TRANSPARENT);
		return circulo;
	}

}
