package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonTerminarTurno;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaSalida extends VistaAccion{

	public VistaSalida(){
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("Caiste en Salida.");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica("Descansa que no pasa nada.");
		BotonTerminarTurno boton = new BotonTerminarTurno();
		this.getChildren().addAll(label1, label2, boton);
	}
	
}
