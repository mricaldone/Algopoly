package fiuba.algo3.tp2.vista.partida.casillero;

import javafx.scene.layout.HBox;

public class VistaCasilleroDetalle extends HBox {

	VistaConstruccion vistaActual;

	public VistaCasilleroDetalle() {
		this.getStyleClass().add("VistaCasilleroDetalle");
		VistaConstruccion noConstruccion = new VistaConstruccion("file:assets/construcciones/construccion-null.png");
		this.getChildren().add(noConstruccion);
		this.vistaActual=noConstruccion;
	}

	public void cambiarVista(VistaConstruccion vistaNueva) {
		this.getChildren().remove(this.vistaActual);
		this.getChildren().add(vistaNueva);
		this.vistaActual = vistaNueva;
	}

}
