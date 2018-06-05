package fiuba.algo3.tp2.vista.botones.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OpcionAcercaDeEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent actionEvent) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Acerca de...");
		alert.setHeaderText("Programa Algopoly");
		String mensaje = "75.07 Algoritmos y  programacion III.\n "
				+ "Integrantes:\n Mateo HARFUCH\n Julian Martin\n Matias Ricaldone\n Federico Zugna";
		alert.setContentText(mensaje);
		alert.show();
	}
}
