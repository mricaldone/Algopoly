package fiuba.algo3.tp2.vista.partida.turno;

import fiuba.algo3.tp2.vista.botones.BotonAlgoPoly;
import fiuba.algo3.tp2.vista.botones.BotonConstruir;
import fiuba.algo3.tp2.vista.botones.BotonProponerIntercambio;
import fiuba.algo3.tp2.vista.botones.BotonTirarDados;
import fiuba.algo3.tp2.vista.botones.BotonVender;
import fiuba.algo3.tp2.vista.partida.turno.efectos.VistaAccion;

public class VistaTurnoInicial extends VistaAccion {
	
	public VistaTurnoInicial(){
		this.getChildren().addAll(construirBotones());
	}

	private BotonAlgoPoly[] construirBotones(){
		BotonAlgoPoly construir = new BotonConstruir();
		
		BotonVender vender = new BotonVender();
		
		BotonProponerIntercambio intercambiar = new BotonProponerIntercambio();
		
		BotonTirarDados tirar_dados = new BotonTirarDados();
		
		BotonAlgoPoly[] botones = {construir,vender,intercambiar,tirar_dados};
		return botones;
	}
	
}
