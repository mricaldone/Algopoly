package fiuba.algo3.tp2.modelo.encasillables.propiedades;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorNull;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.construibles.Construccion;
import fiuba.algo3.tp2.modelo.excepciones.BancaRotaException;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.excepciones.FaltaAdquirirParejaException;
import fiuba.algo3.tp2.modelo.excepciones.NoHayConstruccionesParaDemoler;


public abstract class Terreno extends Propiedad implements Edificable {
	
	private Construccion construccion;
	private static final int PTJ_DE_REINTEGRO = 85;
	
	public Terreno(Dinero precio_compra) {
		super(precio_compra);
	}
	
	public void setConstruccion(Construccion nueva_construccion) {
		construccion = nueva_construccion;
		this.setChanged();
		this.notifyObservers(this.construccion);
	}
	
	@Override
	public boolean esNull() {
		return false;
	}
	
	@Override
	public Construccion getConstruccion() {
		return construccion;
	}
	
	@Override
	public void aplicarEfecto(Jugador jugador, Cubilete dados) throws DineroInsuficienteException, BancaRotaException {
		if(this.getPropietario().esNull()) return;
		Dinero precio_alquiler = construccion.getAlquiler();
		jugador.pagar(precio_alquiler);
		this.getPropietario().cobrar(precio_alquiler);
	}

	public void quiereContruir(Terreno pareja) {
		if(pareja.getPropietario() != this.getPropietario()) throw new FaltaAdquirirParejaException(); 
	}
	
	@Override
	public boolean demoler() {
		Dinero precio_construccion = construccion.getPrecioDemolicion();
		Dinero monto_a_cobrar = precio_construccion.obtenerPorcentaje(PTJ_DE_REINTEGRO);
		try {
			construccion = construccion.demoler();
			this.setChanged();
			this.notifyObservers(this.construccion);
		}catch(NoHayConstruccionesParaDemoler e) {
			return false;
		}
		this.getPropietario().cobrar(monto_a_cobrar);
		return true;
	}
	
	public void demolerTodo() {
		while(this.demoler()) {}
	}
	
	@Override
	public void vender() {
		Jugador propietario = this.getPropietario();
		Dinero precio_terreno = this.getPrecio();
		Dinero monto_a_cobrar = precio_terreno.obtenerPorcentaje(PTJ_DE_REINTEGRO);
		propietario.cobrar(monto_a_cobrar);
		this.demolerTodo();
		this.cambiarPropietario(new JugadorNull());
		propietario.quitarPropiedad(this);
	}
	
	@Override
	public Dinero getAlquiler(Cubilete dados) {
		return this.construccion.getAlquiler();
	}
	
}
