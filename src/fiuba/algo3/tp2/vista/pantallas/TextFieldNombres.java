package fiuba.algo3.tp2.vista.pantallas;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.control.TextField;

@SuppressWarnings("serial")
public class TextFieldNombres extends ArrayList<Node> {

	private TextFieldNombreJugador nombreJugador1;
	private TextFieldNombreJugador nombreJugador2;
	private TextFieldNombreJugador nombreJugador3;

	public TextFieldNombres() {
		nombreJugador1 = new TextFieldNombreJugador("Jugador1");
		nombreJugador2 = new TextFieldNombreJugador("Jugador2");
		nombreJugador3 = new TextFieldNombreJugador("Jugador3");
		this.add(nombreJugador1);
		this.add(nombreJugador2);
		this.add(nombreJugador3);
	}

	public ArrayList<String> getNombres(){
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add(nombreJugador1.getText());
		nombres.add(nombreJugador2.getText());
		nombres.add(nombreJugador3.getText());
		return nombres;
	}
	
	private class TextFieldNombreJugador extends TextField {

		public TextFieldNombreJugador(String textoDefault){			
			this.setText(textoDefault);
			this.getStyleClass().add("TextFieldNombreJugador");
		}
		
	}
	
}
