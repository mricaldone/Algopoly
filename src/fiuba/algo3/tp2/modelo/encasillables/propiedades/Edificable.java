package fiuba.algo3.tp2.modelo.encasillables.propiedades;

import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.Construccion;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;

public interface Edificable {

	void construir() throws DineroInsuficienteException;
	Construccion getConstruccion();
	void setConstruccion(Construccion construccion);
	boolean demoler();

}
