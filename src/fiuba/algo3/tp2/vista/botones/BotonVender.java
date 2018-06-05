package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonVenderHandler;

public class BotonVender extends BotonAlgoPoly {

	public BotonVender() {
		this.setText("Vender");
		this.setOnAction(new BotonVenderHandler());
	}

}
