package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonMensajeGenerico;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaMensajeGenerico extends VistaAccion{

	public VistaMensajeGenerico(String mensaje, VistaAccion vista_siguiente){
		LabelTurnoDinamica label = new LabelTurnoDinamica(mensaje);
		BotonMensajeGenerico boton = new BotonMensajeGenerico(vista_siguiente);
		this.getChildren().addAll(label, boton);
	}
	
}
