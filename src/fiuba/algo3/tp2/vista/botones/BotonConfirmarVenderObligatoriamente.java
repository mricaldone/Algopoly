package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.eventos.BotonConfirmarVenderObligatoriamenteHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarVenderObligatoriamente extends BotonAlgoPoly {

	public BotonConfirmarVenderObligatoriamente(ComboBox<Propiedad> combo_propiedades) {
		this.setText("Confirmar");
		this.setOnAction(new BotonConfirmarVenderObligatoriamenteHandler(combo_propiedades));
	}

}
