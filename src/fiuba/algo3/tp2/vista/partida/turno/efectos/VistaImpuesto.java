package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonAplicarEfecto;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaImpuesto extends VistaAccion{

	public VistaImpuesto(){
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("Impuesto al lujo.");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica("Pagaras 10% de tu efectivo.");
		BotonAplicarEfecto boton = new BotonAplicarEfecto();
		this.getChildren().addAll(label1,label2,boton);
	}
}
