package fiuba.algo3.tp2.vista.partida.tablero;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorTablero extends BorderPane {
	
	FactoryCasilleros factory;
	
	public ContenedorTablero() {
		this.getStyleClass().add("VistaTablero");
		
		this.factory = new FactoryCasilleros();
		
		HBox bottom = crearContenedorTableroInferior();
		VBox left = crearContenedorTableroIzquierda();
		HBox top = crearContenedorTableroSuperior();
		VBox right = crearContenedorTableroDerecha();
		
		ContenedorTableroCenter center = new ContenedorTableroCenter();
		
		this.setTop(top);
		this.setLeft(left);
		this.setCenter(center);
		this.setRight(right);
		this.setBottom(bottom);
	}
	
	private HBox crearContenedorTableroInferior() {
		HBox caja = new HBox();
		caja.getChildren().add(factory.getCarcel());
		caja.getChildren().add(factory.getBuenosAiresNorte());
		caja.getChildren().add(factory.getEdesur());
		caja.getChildren().add(factory.getBuenosAiresSur());
		caja.getChildren().add(factory.getQuini6());
		caja.getChildren().add(factory.getSalida());
		return caja;
	}
	
	private HBox crearContenedorTableroSuperior() {
		HBox caja = new HBox();
		caja.getChildren().add(factory.getImpuestoDeLujo());
		caja.getChildren().add(factory.getSantaFe());
		caja.getChildren().add(factory.getAysa());
		caja.getChildren().add(factory.getSaltaNorte());
		caja.getChildren().add(factory.getSaltaSur());
		caja.getChildren().add(factory.getPolicia());
		return caja;
	}
	
	private VBox crearContenedorTableroDerecha() {
		VBox caja = new VBox();
		caja.getChildren().add(factory.getTren());
		caja.getChildren().add(factory.getNeuquen());
		caja.getChildren().add(factory.getRestrocesoDinamico());
		caja.getChildren().add(factory.getTucuman());
		return caja;
	}
	
	private VBox crearContenedorTableroIzquierda() {
		VBox caja = new VBox();
		caja.getChildren().add(factory.getCordobaNorte());
		caja.getChildren().add(factory.getSubte());
		caja.getChildren().add(factory.getAvanceDinamico());
		caja.getChildren().add(factory.getCordobaSur());
		return caja;
	}

	public FactoryCasilleros getFactory() {
		return factory;
	}
	
}
