package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonPolicia;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaPolicia extends VistaAccion{

	public VistaPolicia(){
		LabelTurnoDinamica label = new LabelTurnoDinamica("Caiste en la Policia. A la carcel!");
		BotonPolicia boton = new BotonPolicia();
		this.getChildren().addAll(label,boton);
	}
}
