package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonAplicarEfecto;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaQuini extends VistaAccion{

	public VistaQuini(int monto_ganado){
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("Caiste en el Quini6.");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica("Ganaste $" + monto_ganado);
		BotonAplicarEfecto boton = new BotonAplicarEfecto();
		this.getChildren().addAll(label1,label2,boton);
	}
}
