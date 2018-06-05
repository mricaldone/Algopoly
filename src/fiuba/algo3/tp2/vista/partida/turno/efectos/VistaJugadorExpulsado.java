package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonIniciarTurno;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaJugadorExpulsado extends VistaAccion{

	public VistaJugadorExpulsado(String jugador) {
		LabelTurnoDinamica label = new LabelTurnoDinamica(jugador + " ha sido eliminado.");
		BotonIniciarTurno boton = new BotonIniciarTurno();
		this.getChildren().addAll(label,boton);
	}
	
}
