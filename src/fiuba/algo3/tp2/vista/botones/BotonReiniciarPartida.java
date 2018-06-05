package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonReiniciarPartidaHandler;

public class BotonReiniciarPartida extends BotonAlgoPoly {

	public BotonReiniciarPartida() {
		this.setText("Iniciar Partida");
		this.setOnAction(new BotonReiniciarPartidaHandler());
	}
	
}
