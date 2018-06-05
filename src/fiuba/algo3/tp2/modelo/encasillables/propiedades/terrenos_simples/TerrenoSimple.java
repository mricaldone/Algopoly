package fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.Construccion;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionBaldio;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.ConstruccionCasa;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;


public abstract class TerrenoSimple extends Terreno {
	
	public TerrenoSimple(Dinero precioTerreno, Dinero alquiler, Dinero alquilerCon1Casa, Dinero costoConstruccionCasa) {
		super(precioTerreno);
		Construccion baldio = new ConstruccionBaldio(alquiler);
		Construccion casa = new ConstruccionCasa(costoConstruccionCasa, alquilerCon1Casa, baldio);
		baldio.setMejora(casa);
		this.setConstruccion(baldio);
	}
	
	@Override
	public void construir() throws DineroInsuficienteException, NoHayMasMejorasException {		
		Construccion nueva_construccion = this.getConstruccion().construirMejora();
		this.getPropietario().pagar(nueva_construccion.getPrecioConstruccion());
		this.setConstruccion(nueva_construccion);	
		
	}
	
	@Override
	public void cambiarPropietario(Jugador nuevo_propietario) {
		this.demolerTodo();
		this.setPropietario(nuevo_propietario);
	}
	
}
