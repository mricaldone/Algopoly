package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.eventos.BotonConfirmarPropuestaHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarPropuesta extends BotonAlgoPoly {

	public BotonConfirmarPropuesta(ComboBox<Propiedad> combo_propiedades_propias, ComboBox<Propiedad> combo_propiedades_ajenas) {
		this.setText("Confirmar");
		this.setOnAction(new BotonConfirmarPropuestaHandler(combo_propiedades_propias, combo_propiedades_ajenas));
	}

}
