package fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.estrategias;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Servicio;

public class EstrategiaSinServicios implements EstrategiaServicios {

	@Override
	public Dinero totalServicio(Servicio actual, Cubilete dados) {
		return new Dinero(0);
	}

}
