package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonAvanzarHandler;

public class BotonAvanzar extends BotonAlgoPoly {

	public BotonAvanzar() {
		this.setText("Avanzar");
		this.setOnAction(new BotonAvanzarHandler());
	}
}
