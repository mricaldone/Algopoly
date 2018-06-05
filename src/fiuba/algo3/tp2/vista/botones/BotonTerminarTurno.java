package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonTerminarTurnoHandler;

public class BotonTerminarTurno extends BotonAlgoPoly {
	
	public BotonTerminarTurno(){
		this.setText("Terminar Turno");
		this.setOnAction(new BotonTerminarTurnoHandler());
	}

}
