package fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.estrategias;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Servicio;

public class EstrategiaUnServicio implements EstrategiaServicios {

	private int penalidad;
	private EstrategiaServicios siguiente_estrategia;
	
	public EstrategiaUnServicio(int penalidad_1_servicio, EstrategiaServicios estrategia_siguiente) {
		penalidad = penalidad_1_servicio;
		siguiente_estrategia = estrategia_siguiente;
		
	}

	@Override
	public Dinero totalServicio(Servicio servicio_actual, Cubilete dados) {
		Servicio propiedad_pareja = servicio_actual.getPareja();
		if(servicio_actual.getPropietario() != propiedad_pareja.getPropietario()) return new Dinero(penalidad * dados.sumarValores());
		return siguiente_estrategia.totalServicio(servicio_actual, dados);
	}

}
