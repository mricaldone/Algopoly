package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonConstruirHandler;

public class BotonConstruir extends BotonAlgoPoly {
	
	public BotonConstruir(){
		this.setText("Construir");
		this.setOnAction(new BotonConstruirHandler());
	}

}
