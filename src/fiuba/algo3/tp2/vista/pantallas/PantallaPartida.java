package fiuba.algo3.tp2.vista.pantallas;

import fiuba.algo3.tp2.vista.ContenedorPrincipal;
import fiuba.algo3.tp2.vista.partida.ronda.ContenedorRonda;
import fiuba.algo3.tp2.vista.partida.tablero.ContenedorTablero;
import fiuba.algo3.tp2.vista.partida.turno.VistaAcciones;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class PantallaPartida extends BorderPane {

	public PantallaPartida(ContenedorPrincipal contenedor_padre, ContenedorTablero contenedor_tablero, VistaAcciones contenedor_acciones, ContenedorRonda contenedor_ronda) {
		this.getStyleClass().add("ContenedorPartida");
		VBox izquierda = new VBox();
		izquierda.getChildren().addAll(contenedor_ronda, contenedor_acciones);
		
		this.setLeft(izquierda);
		this.setCenter(contenedor_tablero);
		//this.setTop(new BarraDeMenu(stage));
		contenedor_padre.getChildren().clear();
		contenedor_padre.getChildren().add(this);
	}

}
