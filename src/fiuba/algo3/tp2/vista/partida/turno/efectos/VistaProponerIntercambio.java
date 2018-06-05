package fiuba.algo3.tp2.vista.partida.turno.efectos;

import java.util.ArrayList;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.vista.botones.BotonCambiarVista;
import fiuba.algo3.tp2.vista.botones.BotonConfirmarPropuesta;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;
import fiuba.algo3.tp2.vista.partida.turno.VistaTurnoInicial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class VistaProponerIntercambio extends VistaAccion {

	public VistaProponerIntercambio() {
		this.getStyleClass().add("VistaTurnoDinamica");
		
		LabelTurnoDinamica mensaje1 = new LabelTurnoDinamica("¿Que propiedad desea?");
		
		ArrayList<Propiedad> propiedades_ajenas = ControladorPrincipal.getInstance().getPropiedadesAjenas();
		ObservableList<Propiedad> opciones2 = FXCollections.observableArrayList(propiedades_ajenas);
		ComboBox<Propiedad> combo_propiedades_ajenas = new ComboBox<Propiedad>(opciones2);
		
		LabelTurnoDinamica mensaje2 = new LabelTurnoDinamica("¿Que propiedad ofrece?");
		

		ArrayList<Propiedad> propiedades_propias = ControladorPrincipal.getInstance().getPropiedadesPropias();
		ObservableList<Propiedad> opciones1 = FXCollections.observableArrayList(propiedades_propias);
		ComboBox<Propiedad> combo_propiedades_propias = new ComboBox<Propiedad>(opciones1);
		
		BotonConfirmarPropuesta boton_confirmar = new BotonConfirmarPropuesta(combo_propiedades_propias, combo_propiedades_ajenas);
		BotonCambiarVista boton_cancelar = new BotonCambiarVista("Cancelar", new VistaTurnoInicial());
		
		this.getChildren().addAll(mensaje1, combo_propiedades_ajenas, mensaje2, combo_propiedades_propias, boton_confirmar, boton_cancelar);
		
	}
	
}
