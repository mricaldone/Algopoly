package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarVenderPropiedadHandler implements EventHandler<ActionEvent> {

	private ComboBox<Propiedad> combo_propiedades;
	
	public BotonConfirmarVenderPropiedadHandler(ComboBox<Propiedad> combo_propiedades) {
		this.combo_propiedades = combo_propiedades;
	}

	@Override
	public void handle(ActionEvent arg0) {
		ControladorPrincipal.getInstance().accionConfirmarVender(this.combo_propiedades.getValue());
	}

}
