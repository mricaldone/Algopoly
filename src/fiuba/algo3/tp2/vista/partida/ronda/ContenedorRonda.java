package fiuba.algo3.tp2.vista.partida.ronda;

import javafx.scene.Node;
import javafx.scene.layout.HBox;

public class ContenedorRonda extends HBox{
		
	public ContenedorRonda(){
		this.getStyleClass().add("VistaRonda");
	}

	public void ponerJugador(Node jugador){
		this.getChildren().add(jugador);
	}
	
	public void sacarJugador(Node jugador){
		this.getChildren().remove(jugador);
	}

}
