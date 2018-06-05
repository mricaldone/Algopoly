package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonPagarAlquiler;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaPropiedadAjena extends VistaAccion{

	public VistaPropiedadAjena(String nombre_propietario, int monto){
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("Caiste en una propiedad de:");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica(nombre_propietario);
		LabelTurnoDinamica label3 = new LabelTurnoDinamica("Debes pagar $ " + monto);
		BotonPagarAlquiler boton = new BotonPagarAlquiler();
		this.getChildren().addAll(label1,label2,label3,boton);
	}
	
}
