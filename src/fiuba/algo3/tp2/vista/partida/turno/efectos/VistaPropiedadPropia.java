package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonTerminarTurno;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaPropiedadPropia extends VistaAccion{

	public VistaPropiedadPropia(){
		LabelTurnoDinamica label = new LabelTurnoDinamica("Hogar dulce hogar.");
		BotonTerminarTurno boton = new BotonTerminarTurno();
		this.getChildren().addAll(label,boton);
	}
	
}
