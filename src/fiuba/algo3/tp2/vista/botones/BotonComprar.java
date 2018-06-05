package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonComprarHandler;

public class BotonComprar extends BotonAlgoPoly{
	
	public BotonComprar(){
		this.setText("Comprar");
		this.setOnAction(new BotonComprarHandler());
	}

}
