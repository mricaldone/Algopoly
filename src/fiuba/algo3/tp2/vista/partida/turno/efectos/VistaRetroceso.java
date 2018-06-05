package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonRetrocesoDinamico;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaRetroceso extends VistaAccion {

	public VistaRetroceso(int cant_casilleros) {
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("Caiste en Retroceso Dinamico.");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica("Retrocederas " + cant_casilleros + " casilleros.");
		BotonRetrocesoDinamico boton = new BotonRetrocesoDinamico(cant_casilleros);
		this.getChildren().addAll(label1,label2,boton);
	}
}
