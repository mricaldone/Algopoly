package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarPropuestaHandler implements EventHandler<ActionEvent> {
	
	ComboBox<Propiedad> combo_propiedades_propias;
	ComboBox<Propiedad> combo_propiedades_ajenas;
	
	public BotonConfirmarPropuestaHandler(ComboBox<Propiedad> combo_propiedades_propias, ComboBox<Propiedad> combo_propiedades_ajenas) {
		this.combo_propiedades_ajenas = combo_propiedades_ajenas;
		this.combo_propiedades_propias = combo_propiedades_propias;
	}

	@Override
	public void handle(ActionEvent event) {
		ControladorPrincipal.getInstance().accionConfirmarPropuesta(combo_propiedades_propias.getValue(), combo_propiedades_ajenas.getValue());
	}
	
}
