package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonIniciarTurnoHandler;

public class BotonIniciarTurno extends BotonAlgoPoly {
	
	public BotonIniciarTurno(){
		this.setText("Continuar");
		this.setOnAction(new BotonIniciarTurnoHandler());
	}

}
