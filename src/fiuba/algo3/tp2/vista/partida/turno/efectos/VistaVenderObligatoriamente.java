package fiuba.algo3.tp2.vista.partida.turno.efectos;

import java.util.ArrayList;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.BotonConfirmarVenderObligatoriamente;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class VistaVenderObligatoriamente extends VistaAccion {

	public VistaVenderObligatoriamente() {
		ArrayList<Propiedad> propiedades = ControladorPrincipal.getInstance().getPropiedadesPropias();
		this.getStyleClass().add("VistaTurnoDinamica");
		LabelTurnoDinamica mensaje = new LabelTurnoDinamica("Elija que desea vender:");
		
		ObservableList<Propiedad> opciones = FXCollections.observableArrayList(propiedades);
		ComboBox<Propiedad> combo_propiedades = new ComboBox<Propiedad>(opciones);
		
		BotonConfirmarVenderObligatoriamente boton_confirmar = new BotonConfirmarVenderObligatoriamente(combo_propiedades);
		
		this.getChildren().addAll(mensaje, combo_propiedades, boton_confirmar);
	}
	
}
