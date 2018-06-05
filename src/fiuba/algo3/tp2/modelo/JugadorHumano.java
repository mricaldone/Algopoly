package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.excepciones.BancaRotaException;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.movimiento.Movimiento;
import fiuba.algo3.tp2.modelo.movimiento.MovimientoNormal;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.Tablero;
import javafx.scene.paint.Color;

public class JugadorHumano extends Jugador {

	private Movimiento movimiento;
	private Dinero dinero;
	private String nombre;
	private Color color;
	
	private ArrayList<Propiedad> propiedades;
	private ArrayList<String> propiedadesComprables;
	//private Deuda deuda;
	
	private static final int PTJ_REINTEGRO_VENTA_DE_PROPIEDADES = 85;

	public JugadorHumano(Tablero tablero, Dinero dinero_inicial) {
		dinero = dinero_inicial.clone();
		propiedades = new ArrayList<Propiedad>();
		propiedadesComprables=new ArrayList<String>();
		movimiento = new MovimientoNormal(tablero);
		//deuda = new Deuda(new Dinero(0));
	}

	@Override
	public void avanzar(int cant_casilleros) {
		movimiento.avanzar(cant_casilleros);		
	}

	@Override
	public void retroceder(int cant_casilleros) {
		movimiento.retroceder(cant_casilleros);
	}

	@Override
	public Dinero obtenerDinero() {
		return this.dinero.clone();
	}

	@Override
	public void cobrar(Dinero monto) {
		this.dinero.aumentarCantidad(monto);
		this.setChanged();
		this.notifyObservers();
	}

	public void comprar(Propiedad comprable) throws DineroInsuficienteException{
		comprable.comprar(this);
		this.propiedades.add(comprable);
	}

	@Override
	public Encasillable obtenerCasilleroActual() {
		return this.movimiento.verActual();
	}

	@Override
	public int getCantidadDePropiedades() {
		return propiedades.size();
	}

	@Override
	public Dinero obtenerPatrimonio() {
		Dinero patrimonio = this.obtenerDinero();
		for(Propiedad propiedad:propiedades) {
			patrimonio.aumentarCantidad(propiedad.getPrecio().obtenerPorcentaje(PTJ_REINTEGRO_VENTA_DE_PROPIEDADES));
		}
		return patrimonio;
	}
	
	@Override
	public void aplicarEfectoDeCasilleroActual(Cubilete cubilete) throws DineroInsuficienteException, BancaRotaException {
		Encasillable casillero = this.movimiento.verActual();
		casillero.aplicarEfecto(this, cubilete);
	}

	@Override
	public void avanzarHasta(Encasillable casillero) {
		this.movimiento.avanzarHasta(casillero);
	}

	@Override
	public void pagar(Dinero monto) throws DineroInsuficienteException, BancaRotaException {
		if(monto.esMayorQue(this.obtenerPatrimonio())) throw new BancaRotaException();
		dinero.disminuirCantidad(monto);
		setChanged();
		notifyObservers();
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public void comprarCasilleroActual() throws DineroInsuficienteException {
		Propiedad casillero_actual = (Propiedad) this.obtenerCasilleroActual();
		this.comprar(casillero_actual);
	}

	@Override
	public void entregarPropiedad(Jugador destinatario, Propiedad propiedad) {
		if(propiedades.contains(propiedad)) {
			destinatario.agregarPropiedad(propiedad);
			propiedades.remove(propiedad);
		}
	}

	@Override
	public void agregarPropiedad(Propiedad propiedad) {
		propiedades.add(propiedad);
		propiedad.cambiarPropietario(this);
		if(propiedad.esPropiedad()){
			propiedadesComprables.add(propiedad.toString());
		}
	}

	@Override
	public ArrayList<String> getListaComprables(){
		return this.propiedadesComprables;
	}
	
	@Override
	public boolean esNull() {
		return false;
	}
	
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	//Provisorio! Deber�a ir en constructor
	@Override
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public void setColor(Color color) {
		this.color=color;
	}

	@Override
	public void pagarFianza() throws DineroInsuficienteException {
		movimiento.desencarcelar(this);
	}

	@Override
	public Movimiento getMovimiento() {
		return movimiento;
	}

	@Override
	public void setMovimiento(Movimiento nuevo_movimiento) {
		movimiento = nuevo_movimiento;
	}

	@Override
	public void avisarCambioDeTurno() {
		movimiento.avisarCambioDeTurno(this);
	}

	@Override
	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}

	@Override
	public void quitarPropiedad(Propiedad propiedad) {
		propiedades.remove(propiedad);
	}

	@Override
	public boolean estaEncarcelado() {
		return movimiento.estaEnCarcel();
	}
	
	public String toString() {
		return this.getNombre();
	}
	
}
