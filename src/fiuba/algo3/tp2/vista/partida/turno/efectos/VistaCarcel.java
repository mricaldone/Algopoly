package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonPagarFianza;
import fiuba.algo3.tp2.vista.botones.BotonTerminarTurno;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaCarcel extends VistaAccion{

	public VistaCarcel(){
		LabelTurnoDinamica label = new LabelTurnoDinamica("ESTAS EN LA CARCEL");
		BotonPagarFianza fianza = new BotonPagarFianza();
		BotonTerminarTurno boton = new BotonTerminarTurno();
		this.getChildren().addAll(label,fianza,boton);
	}
	
}
