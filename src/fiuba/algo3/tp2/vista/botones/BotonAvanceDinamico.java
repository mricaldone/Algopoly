package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonAvanceDinamicoHandler;

public class BotonAvanceDinamico extends BotonAlgoPoly{
	public BotonAvanceDinamico(int cant_casilleros){
		this.setText("Avanzar");
		this.setOnAction(new BotonAvanceDinamicoHandler(cant_casilleros));
	}
}
