package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaDeEspera extends VistaAccion{

	public VistaDeEspera(){
		LabelTurnoDinamica label = new LabelTurnoDinamica("Espere...");
		this.getChildren().addAll(label);
	}
	
}
