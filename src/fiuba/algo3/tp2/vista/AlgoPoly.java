package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controlador.ControladorPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AlgoPoly extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage);
		contenedorPrincipal.inicializar();
		
		ControladorPrincipal.getInstance().asociarContenedorPrincipal(contenedorPrincipal);

		Scene escenaPrincipal = new Scene(contenedorPrincipal);
		escenaPrincipal.getStylesheets().add("fiuba/algo3/tp2/vista/estilos/styles_1366x768.css");
		
		stage.setFullScreenExitHint("");
		stage.setTitle("AlgoPoly");
		stage.setScene(escenaPrincipal);
		stage.getIcons().add(new Image("file:assets/icon.png"));
		
		stage.setMaximized(false);
		stage.setFullScreen(false);
		stage.setResizable(false);
		stage.show();
		
	}

	public static void main(String[] args) throws Exception {
		launch(args);
	}
	
	

	
}
