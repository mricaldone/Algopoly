package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.BotonCancelarIntercambio;
import fiuba.algo3.tp2.vista.botones.BotonConfirmarIntercambio;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaConfirmarIntercambio extends VistaAccion {

	public VistaConfirmarIntercambio(Propiedad propiedad_propia, Propiedad propiedad_ajena) {
		this.getStyleClass().add("VistaTurnoDinamica");
		
		LabelTurnoDinamica mensaje1 = new LabelTurnoDinamica("Mensaje para " + propiedad_ajena.getPropietario() + ":");
		LabelTurnoDinamica mensaje2 = new LabelTurnoDinamica(propiedad_propia.getPropietario() + " quiere intercambiar");
		LabelTurnoDinamica mensaje3 = new LabelTurnoDinamica(propiedad_propia + " por " + propiedad_ajena);
		
		BotonConfirmarIntercambio boton_confirmar = new BotonConfirmarIntercambio(propiedad_propia, propiedad_ajena);
		BotonCancelarIntercambio boton_cancelar = new BotonCancelarIntercambio(propiedad_propia);
		
		this.getChildren().addAll(mensaje1, mensaje2, mensaje3, boton_confirmar, boton_cancelar);
	}
	
}
