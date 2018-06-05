package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonMensajeGenericoHandler;
import fiuba.algo3.tp2.vista.partida.turno.efectos.VistaAccion;

public class BotonMensajeGenerico extends BotonAlgoPoly {
	
	public BotonMensajeGenerico(VistaAccion vista_siguiente) {
		this.setText("Continuar");
		this.setOnAction(new BotonMensajeGenericoHandler(vista_siguiente));
	}

}
