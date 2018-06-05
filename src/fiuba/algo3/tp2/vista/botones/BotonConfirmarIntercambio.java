package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.eventos.BotonConfirmarIntercambioHandler;

public class BotonConfirmarIntercambio extends BotonAlgoPoly{

	public BotonConfirmarIntercambio(Propiedad propiedad_propia, Propiedad propiedad_ajena) {
		this.setText("Confirmar");
		this.setOnAction(new BotonConfirmarIntercambioHandler(propiedad_propia, propiedad_ajena));
	}

}
