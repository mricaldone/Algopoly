package fiuba.algo3.tp2.vista.partida.casillero;

import java.util.Stack;

import javafx.scene.layout.HBox;


public class VistaCasilleroJugadores extends HBox {
	
	private Stack<VistaCasilleroJugador> disponibles;

	public VistaCasilleroJugadores() {
		this.getStyleClass().add("VistaCasilleroJugadores");
		VistaCasilleroJugador jugador1=new VistaCasilleroJugador();
		VistaCasilleroJugador jugador2=new VistaCasilleroJugador();
		VistaCasilleroJugador jugador3=new VistaCasilleroJugador();
		this.disponibles=new Stack<VistaCasilleroJugador>();
		disponibles.push(jugador1);
		disponibles.push(jugador2);
		disponibles.push(jugador3);
		this.getChildren().addAll(jugador1,jugador2,jugador3);
	}

	public void ponerJugador(VistaCasilleroJugador jugador){
		this.getChildren().remove(this.disponibles.pop());
		this.getChildren().add(jugador);
	}
	
	public void sacarJugador(VistaCasilleroJugador jugador){
		if(!this.getChildren().remove(jugador)) this.getChildren().remove(this.disponibles.pop());
		VistaCasilleroJugador vacia= new VistaCasilleroJugador();
		this.getChildren().add(vacia);
		this.disponibles.push(vacia);
	}
	
}
