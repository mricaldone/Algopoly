package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.vista.pantallas.PantallaInicial;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ContenedorPrincipal extends Pane{

	private Pane vistaActual;
	//private ControladorPrincipal controlador_principal;

	public ContenedorPrincipal(Stage stage) {
		
	}

	public void inicializar() {
		//this.vistaActual=new PantallaInicial(this, controlador_principal);
		this.vistaActual=new PantallaInicial(this);
		this.getChildren().add(this.vistaActual);
	}
	
	public void cambiarVistaDinamica(Pane nuevaVista){
		this.getChildren().remove(this.vistaActual);
		this.getChildren().add(nuevaVista);
		this.vistaActual=nuevaVista;
	}
	
}
