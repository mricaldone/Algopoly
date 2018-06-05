package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.vista.botones.eventos.BotonPagarHandler;
import fiuba.algo3.tp2.vista.partida.turno.VistaAcciones;

public class BotonPagar extends BotonAlgoPoly{
	
	public BotonPagar(VistaAcciones contenedorPadre){
		this.setText("Pagar");
		this.setOnAction(new BotonPagarHandler(contenedorPadre));
	}
	
}
