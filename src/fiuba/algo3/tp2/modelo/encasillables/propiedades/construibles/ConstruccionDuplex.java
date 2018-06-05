package fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;


public class ConstruccionDuplex extends Construccion {
	
	/*
	public ConstruccionDuplex(Dinero costo_construccion, Dinero costo_alquiler, Construible anterior, Construible mejora) {
		proxima_mejora = mejora;
		precio_alquiler = costo_alquiler;
		precio_construccion = costo_construccion;
		mejora_anterior = anterior;
	}
	*/
	public ConstruccionDuplex(Dinero costo_construccion, Dinero costo_alquiler, Construccion anterior) {
		//proxima_mejora = this;
		proxima_mejora = new ConstruccionNull();
		precio_alquiler = costo_alquiler;
		precio_construccion = costo_construccion;
		mejora_anterior = anterior;
	}
	
	@Override
	public Construccion construirMejora(Terreno actual, Terreno pareja) {
		actual.quiereContruir(pareja); // <-- SALTA EXCEPCION SI EL DUEÑO NO ES EL MISMO
		pareja.getConstruccion().parejaQuiereConstruirHotel(); // <-- SALTA EXCEPCION SI LA PAREJA TIENE BALDIO O CASA
		return this.construirMejora(); // <-- SALTA EXCEPCION SI NO HAY MAS MEJORAS
	}

	@Override
	public void parejaQuiereConstruirHotel() {
		return;
	}

}
