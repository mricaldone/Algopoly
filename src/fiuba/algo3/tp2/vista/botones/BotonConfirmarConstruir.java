package fiuba.algo3.tp2.vista.botones;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import fiuba.algo3.tp2.vista.botones.eventos.BotonConfirmarConstruirHandler;
import javafx.scene.control.ComboBox;

public class BotonConfirmarConstruir extends BotonAlgoPoly {

	public BotonConfirmarConstruir(ComboBox<Terreno> combo_terrenos) {
		this.setText("Confirmar");
		this.setOnAction(new BotonConfirmarConstruirHandler(combo_terrenos));
	}

}
