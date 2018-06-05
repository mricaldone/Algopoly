package fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.excepciones.NoHayConstruccionesParaDemoler;


public class ConstruccionBaldio extends Construccion {
	
	/*
	public ConstruccionBaldio(Dinero alquiler, Construible mejora) {
		proxima_mejora = mejora;
		precio_alquiler = alquiler;
	}
	*/
	public ConstruccionBaldio(Dinero alquiler) {
		proxima_mejora = new ConstruccionNull();
		//proxima_mejora = this;
		precio_alquiler = alquiler;
		precio_construccion = new Dinero(0);
	}

	@Override
	public Construccion demoler() throws NoHayConstruccionesParaDemoler {
		throw new NoHayConstruccionesParaDemoler();
		//return this;
	}
}
