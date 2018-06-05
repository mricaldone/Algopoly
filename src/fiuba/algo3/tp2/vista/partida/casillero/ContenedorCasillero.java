package fiuba.algo3.tp2.vista.partida.casillero;

import java.util.Observable;
import java.util.Observer;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.Construccion;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionBaldio;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionCasa;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionDuplex;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionHotel;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ContenedorCasillero extends VBox implements Observer{
	
	private VistaCasilleroNombre nombre;
	private VistaCasilleroDetalle detalle ;
	private VistaCasilleroJugadores jugadores ;
	private VBox contenedor;
	
	public ContenedorCasillero(String nombreCasillero,Color color){
		this.getStyleClass().add("VistaCasillero");
		nombre = new VistaCasilleroNombre(nombreCasillero,color);
		detalle = new VistaCasilleroDetalle();
		jugadores = new VistaCasilleroJugadores();
		
		//detalle.setPrefHeight(this.getPrefHeight()/3);
		//jugadores.setPrefHeight(this.getPrefHeight()/3);
		
		//detalle.setPrefWidth(this.getPrefWidth());
		//jugadores.setPrefWidth(this.getPrefWidth());
		
		contenedor = new VBox();
		contenedor.getChildren().addAll(detalle,jugadores);
		contenedor.getStyleClass().add("VistaCasilleroContenedor");
		this.getChildren().addAll(nombre,contenedor);

	}
	
	public VistaCasilleroJugadores getJugadores(){
		return this.jugadores;
	}
	
	public void actualizarDetalle(VistaCasilleroDetalle vistaDetalle){
		this.detalle=vistaDetalle;
		//remplazar la vista detalle
		//this.getChildren().replaceAll(operator);
	}
	
	public void borrarJugador(VistaCasilleroJugador vista) {
		jugadores.sacarJugador(vista);
	}

	public void dibujarJugador(VistaCasilleroJugador vista) {
		jugadores.ponerJugador(vista);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Color){
			Color color = (Color) arg;
			this.contenedor.setBorder(new Border(new BorderStroke(color,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(0,3,3,3))));
			this.nombre.setBorder(new Border(new BorderStroke(color,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3,3,0,3))));
			return;
		}	
		Construccion construccion = (Construccion) arg;
		if(construccion instanceof ConstruccionBaldio) this.detalle.cambiarVista(new VistaConstruccion("file:assets/construcciones/baldio2.png")) ;
		if(construccion instanceof ConstruccionCasa) this.detalle.cambiarVista(new VistaConstruccion("file:assets/construcciones/casa3.png"));
		if(construccion instanceof ConstruccionDuplex) this.detalle.cambiarVista(new VistaConstruccion("file:assets/construcciones/duplex3.png"));
		if(construccion instanceof ConstruccionHotel) this.detalle.cambiarVista(new VistaConstruccion("file:assets/construcciones/hotel3.png"));	

	}
	
}
