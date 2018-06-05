package fiuba.algo3.tp2.vista.partida.turno.efectos;

import java.util.ArrayList;

import fiuba.algo3.tp2.vista.botones.BotonAvanzar;
import fiuba.algo3.tp2.vista.partida.turno.VistaDado;
import javafx.scene.layout.HBox;

public class VistaDados extends VistaAccion{

	public VistaDados(ArrayList<VistaDado> vistas_dados) {
		this.getStyleClass().add("VistaTurnoDinamica");
		HijoHorizontal sectorDados = new HijoHorizontal(vistas_dados);
		BotonAvanzar continuar = new BotonAvanzar();
		this.getChildren().addAll(sectorDados,continuar);
	}

	private class HijoHorizontal extends HBox{
		public HijoHorizontal(ArrayList<VistaDado> vistas_dados){
			this.setSpacing(10);			
			this.getChildren().addAll(vistas_dados);
		}
	}
	
}
