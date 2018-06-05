package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.vista.botones.eventos.OpcionAcercaDeEventHandler;
import fiuba.algo3.tp2.vista.botones.eventos.OpcionPantallaCompletaEventHandler;
import fiuba.algo3.tp2.vista.botones.eventos.OpcionReiniciarEventHandler;
import fiuba.algo3.tp2.vista.botones.eventos.OpcionSalirEventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class BarraDeMenu extends MenuBar {

	MenuItem opcionPantallaCompleta = new MenuItem("Pantalla completa");

	public BarraDeMenu(Stage stage) {

		Menu menuArchivo = new Menu("Opciones");
		Menu menuVer = new Menu("Ver");
		Menu menuAyuda = new Menu("Ayuda");

		MenuItem opcionSalir = new MenuItem("Salir");
		MenuItem opcionAcercaDe = new MenuItem("Acerca de...");
		MenuItem opcionReiniciar = new MenuItem("Reiniciar");

		
		OpcionReiniciarEventHandler opcionReiniciarHandler = new OpcionReiniciarEventHandler(stage);
		opcionReiniciar.setOnAction(opcionReiniciarHandler);
		
		OpcionSalirEventHandler opcionSalirHandler = new OpcionSalirEventHandler();
		opcionSalir.setOnAction(opcionSalirHandler);

		OpcionAcercaDeEventHandler opcionAcercaDeHandler = new OpcionAcercaDeEventHandler();
		opcionAcercaDe.setOnAction(opcionAcercaDeHandler);

		OpcionPantallaCompletaEventHandler opcionPantallaCompletaHandler = new OpcionPantallaCompletaEventHandler(stage,
				opcionPantallaCompleta);
		opcionPantallaCompleta.setOnAction(opcionPantallaCompletaHandler);

		opcionPantallaCompleta.setDisable(true);

		menuArchivo.getItems().addAll(opcionReiniciar, opcionSalir);
		menuAyuda.getItems().addAll(opcionAcercaDe);
		menuVer.getItems().addAll(opcionPantallaCompleta);

		this.getMenus().addAll(menuArchivo, menuVer, menuAyuda);
	}

	public void aplicacionMaximizada() {
		opcionPantallaCompleta.setDisable(false);

	}
}