package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonAplicarEfectoHandler;

public class BotonPolicia extends BotonAlgoPoly {
	
	public BotonPolicia(){
		this.setText("Ir a la carcel");
		this.setOnAction(new BotonAplicarEfectoHandler());
	}

}
