package fiuba.algo3.tp2.vista.botones.eventos;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarConstruirHandler implements EventHandler<ActionEvent> {

	private ComboBox<Terreno> combo_terrenos;
	
	public BotonConfirmarConstruirHandler(ComboBox<Terreno> combo_terrenos) {
		this.combo_terrenos = combo_terrenos;
	}

	@Override
	public void handle(ActionEvent arg0) {
		//ControladorPrincipal.getInstance().construir(this.combo_terrenos.getValue());
		ControladorPrincipal.getInstance().accionConfirmarConstruir(this.combo_terrenos.getValue());
	}

}
