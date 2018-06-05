package fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.excepciones.NoHayMasMejorasException;


public class ConstruccionHotel extends Construccion {
	
	/*
	public ConstruccionHotel(Dinero costo_construccion, Dinero costo_alquiler, Construible anterior, Construible mejora) {
		proxima_mejora = mejora;
		precio_alquiler = costo_alquiler;
		precio_construccion = costo_construccion;
		mejora_anterior = anterior;
	}
	*/
	public ConstruccionHotel(Dinero costo_construccion, Dinero costo_alquiler, Construccion anterior) {
		//proxima_mejora = this;
		proxima_mejora = new ConstruccionNull();
		precio_alquiler = costo_alquiler;
		precio_construccion = costo_construccion;
		mejora_anterior = anterior;
	}

	@Override
	public Construccion construirMejora() {
		throw new NoHayMasMejorasException();
	}

	@Override
	public void parejaQuiereConstruirHotel() {
		return;
	}

}
