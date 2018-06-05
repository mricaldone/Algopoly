package fiuba.algo3.tp2.vista.partida.turno.efectos;

import fiuba.algo3.tp2.vista.botones.BotonComprar;
import fiuba.algo3.tp2.vista.botones.BotonTerminarTurno;
import fiuba.algo3.tp2.vista.partida.turno.LabelTurnoDinamica;

public class VistaPropiedadLibre extends VistaAccion{

	public VistaPropiedadLibre(String nombre, int precio){
		LabelTurnoDinamica label1 = new LabelTurnoDinamica("¿" + nombre + " esta libre! �Comprar?");
		LabelTurnoDinamica label2 = new LabelTurnoDinamica("$ " + precio);
		BotonComprar comprar = new BotonComprar();
		BotonTerminarTurno boton = new BotonTerminarTurno();
		this.getChildren().addAll(label1,label2,comprar,boton);
	}
	
}
