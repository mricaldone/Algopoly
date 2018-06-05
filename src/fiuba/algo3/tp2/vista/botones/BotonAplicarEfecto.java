package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonAplicarEfectoHandler;

public class BotonAplicarEfecto extends BotonAlgoPoly {
	
	public BotonAplicarEfecto(){
		this.setText("Terminar Turno");
		this.setOnAction(new BotonAplicarEfectoHandler());
	}

}
