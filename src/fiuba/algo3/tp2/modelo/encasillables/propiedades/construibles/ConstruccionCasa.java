package fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles;

import fiuba.algo3.tp2.modelo.Dinero;



public class ConstruccionCasa extends Construccion {
	
	/*
	public ConstruccionCasa(Dinero costo_construccion, Dinero costo_alquiler, Construible anterior, Construible mejora) {
		proxima_mejora = mejora;
		precio_alquiler = costo_alquiler;
		precio_construccion = costo_construccion;
		mejora_anterior = anterior;
	}
	 */
	public ConstruccionCasa(Dinero costo_construccion, Dinero costo_alquiler, Construccion anterior) {
		proxima_mejora = new ConstruccionNull();
		//proxima_mejora = this;
		precio_alquiler = costo_alquiler;
		precio_construccion = costo_construccion;
		mejora_anterior = anterior;
	}
	
}
