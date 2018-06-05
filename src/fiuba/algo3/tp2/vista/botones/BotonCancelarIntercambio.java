package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.eventos.BotonCancelarIntercambioHandler;

public class BotonCancelarIntercambio extends BotonAlgoPoly{

	public BotonCancelarIntercambio(Propiedad propiedad_propia) {
		this.setText("Cancelar");
		this.setOnAction(new BotonCancelarIntercambioHandler(propiedad_propia));
	}

}
