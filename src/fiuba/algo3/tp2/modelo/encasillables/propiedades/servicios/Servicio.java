package fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorNull;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Emparejable;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.PropiedadNull;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.estrategias.EstrategiaDosServicios;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.estrategias.EstrategiaServicios;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.estrategias.EstrategiaSinServicios;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.estrategias.EstrategiaUnServicio;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.YaTieneParejaException;

public abstract class Servicio extends Propiedad implements Emparejable {

	private EstrategiaServicios estrategia;
	private Propiedad pareja;
	private static final int PTJ_DE_REINTEGRO = 85;
	
	public Servicio(Dinero precio_compra, int penalidad_1_servicio, int penalidad_2_servicios) {
		super(precio_compra);
		EstrategiaServicios estrategia_0 = new EstrategiaSinServicios();
		EstrategiaServicios estrategia_1 = new EstrategiaUnServicio(penalidad_1_servicio, estrategia_0);
		EstrategiaServicios estrategia_2 = new EstrategiaDosServicios(penalidad_2_servicios, estrategia_1);
		estrategia = estrategia_2;
		pareja = new PropiedadNull();
	}
	
	private void realizarCobros(Jugador inquilino, Jugador propietario, Dinero monto) throws DineroInsuficienteException {
		inquilino.pagar(monto);
		propietario.cobrar(monto);
	}
	
	public Dinero getAlquiler(Cubilete dados) {
		return estrategia.totalServicio(this, dados);
	}
	
	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) throws DineroInsuficienteException {
		if(this.getPropietario() == jugador || this.getPropietario().esNull()) return;
		Dinero monto = estrategia.totalServicio(this, dados);
		realizarCobros(jugador, this.getPropietario(), monto);
	}
	
	@Override
	public void setPareja(Propiedad casillero) {
		if(!pareja.esNull()) throw new YaTieneParejaException();
		pareja = casillero;
	}
	
	@Override
	public Servicio getPareja() {
		return (Servicio) pareja;
	}
	
	@Override
	public boolean esNull() {
		return false;
	}
	
	@Override
	public void vender() {
		Jugador propietario = this.getPropietario();
		Dinero precio_terreno = this.getPrecio();
		Dinero monto_a_cobrar = precio_terreno.obtenerPorcentaje(PTJ_DE_REINTEGRO);
		this.getPropietario().cobrar(monto_a_cobrar);
		this.cambiarPropietario(new JugadorNull());
		propietario.quitarPropiedad(this);
	}
	
	@Override
	public void cambiarPropietario(Jugador nuevo_propietario) {
		this.setPropietario(nuevo_propietario);
	}
	
}
