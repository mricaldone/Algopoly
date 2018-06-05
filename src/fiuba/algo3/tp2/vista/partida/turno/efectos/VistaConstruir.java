package fiuba.algo3.tp2.vista.partida.turno.efectos;

import java.util.ArrayList;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import fiuba.algo3.tp2.vista.botones.BotonCambiarVista;
import fiuba.algo3.tp2.vista.botones.BotonConfirmarConstruir;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;
import fiuba.algo3.tp2.vista.partida.turno.VistaTurnoInicial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class VistaConstruir extends VistaAccion {

	public VistaConstruir() {
		ArrayList<Terreno> terrenos = ControladorPrincipal.getInstance().getTerrenos();
		
		this.getStyleClass().add("VistaTurnoDinamica");
		LabelTurnoDinamica mensaje = new LabelTurnoDinamica("Elija donde desea construir:");
		
		ObservableList<Terreno> opciones = FXCollections.observableArrayList(terrenos);
		ComboBox<Terreno> combo_terrenos = new ComboBox<Terreno>(opciones);
		
		BotonConfirmarConstruir boton_confirmar = new BotonConfirmarConstruir(combo_terrenos);
		BotonCambiarVista boton_cancelar = new BotonCambiarVista("Cancelar", new VistaTurnoInicial());
		
		this.getChildren().addAll(mensaje, combo_terrenos, boton_confirmar, boton_cancelar);
	}
	
}
