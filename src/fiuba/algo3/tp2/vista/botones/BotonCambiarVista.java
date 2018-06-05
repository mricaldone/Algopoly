package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonCambiarVistaHandler;
import fiuba.algo3.tp2.vista.partida.turno.efectos.VistaAccion;

public class BotonCambiarVista extends BotonAlgoPoly {
	
	public BotonCambiarVista(String texto, VistaAccion vista){
		this.setText(texto);
		this.setOnAction(new BotonCambiarVistaHandler(vista));
	}

}
