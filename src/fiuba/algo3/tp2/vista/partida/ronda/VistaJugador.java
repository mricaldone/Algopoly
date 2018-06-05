package fiuba.algo3.tp2.vista.partida.ronda;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VistaJugador extends VBox{
	
	Label labelDinero;
	

	public VistaJugador(String nombre,String dinero,Color color){
		this.getStyleClass().add("VistaJugador");
		mostrarNombre(nombre);
		mostrarDinero(dinero);
		mostrarColor(color);
	}
	
	private void mostrarNombre(String nombre){
		Label labelNombre = new Label(nombre);
		labelNombre.setTextFill(Color.WHITE);
		this.getChildren().add(labelNombre);
	}
	
	private void mostrarDinero(String dinero){
		labelDinero = new Label(dinero);
		labelDinero.setTextFill(Color.WHITE);
		this.getChildren().add(labelDinero);
	}
	
	private void mostrarColor(Color color){
		Background background = new Background(new BackgroundFill(color,CornerRadii.EMPTY , Insets.EMPTY));
		this.setBackground(background);
	}
	
	public void actualizarDinero(String nuevoDinero){
		this.labelDinero.setText(nuevoDinero);
	}
	
	
}
