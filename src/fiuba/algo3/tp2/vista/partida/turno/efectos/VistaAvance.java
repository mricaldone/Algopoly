package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonAvanceDinamico;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaAvance extends VistaAccion {
	
	public VistaAvance(int cant_casilleros) {
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("Caiste en Avance Dinamico.");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica("Avanzaras " + cant_casilleros + " casilleros.");
		BotonAvanceDinamico boton = new BotonAvanceDinamico(cant_casilleros);
		this.getChildren().addAll(label1, label2, boton);
		
	}
}
