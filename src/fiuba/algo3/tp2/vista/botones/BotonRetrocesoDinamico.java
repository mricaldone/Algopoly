package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonRetrocesoDinamicoHandler;

public class BotonRetrocesoDinamico extends BotonAlgoPoly{
	public BotonRetrocesoDinamico(int cant_casilleros){
		this.setText("Retroceder");
		this.setOnAction(new BotonRetrocesoDinamicoHandler(cant_casilleros));
	}
	
}
