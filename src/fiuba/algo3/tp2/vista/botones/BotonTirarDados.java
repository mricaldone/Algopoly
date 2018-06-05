package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonTirarDadosHandler;

public class BotonTirarDados extends BotonAlgoPoly {
	
	public BotonTirarDados(){
		this.setText("Tirar Dados");
		this.setOnAction(new BotonTirarDadosHandler());
	}

}
