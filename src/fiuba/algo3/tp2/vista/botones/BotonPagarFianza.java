package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonPagarFianzaHandler;

public class BotonPagarFianza extends BotonAlgoPoly{
	
	public BotonPagarFianza(){
		this.setText("Pagar Fianza");
		this.setOnAction(new BotonPagarFianzaHandler());
	}
	
}
