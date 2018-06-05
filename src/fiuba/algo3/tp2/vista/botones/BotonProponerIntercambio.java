package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonProponerIntercambioHandler;

public class BotonProponerIntercambio extends BotonAlgoPoly {
	
	public BotonProponerIntercambio(){
		this.setText("Intercambiar");
		this.setOnAction(new BotonProponerIntercambioHandler());
	}

}
