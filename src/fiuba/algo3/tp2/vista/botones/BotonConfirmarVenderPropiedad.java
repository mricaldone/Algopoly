package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.eventos.BotonConfirmarVenderPropiedadHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarVenderPropiedad extends BotonAlgoPoly {

	public BotonConfirmarVenderPropiedad(ComboBox<Propiedad> combo_propiedades) {
		this.setText("Confirmar");
		this.setOnAction(new BotonConfirmarVenderPropiedadHandler(combo_propiedades));
	}

}
