package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonPagarAlquilerHandler;

public class BotonPagarAlquiler extends BotonAlgoPoly {
	
	public BotonPagarAlquiler(){
		this.setText("Pagar Alquiler");
		this.setOnAction(new BotonPagarAlquilerHandler());
	}

}
