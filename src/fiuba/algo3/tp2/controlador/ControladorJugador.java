package fiuba.algo3.tp2.controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import fiuba.algo3.tp2.modelo.Dinero;
import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.JugadorHumano;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Terreno;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import fiuba.algo3.tp2.modelo.tablero.Tablero;
import fiuba.algo3.tp2.vista.partida.casillero.VistaCasilleroJugador;
import fiuba.algo3.tp2.vista.partida.ronda.VistaJugador;
import javafx.scene.paint.Color;

public class ControladorJugador implements Observer {

	private Jugador modelo;
	private VistaJugador vista;
	private VistaCasilleroJugador vistaCasillero;

	public ControladorJugador(Tablero tablero, String nombre, Dinero dinero_inicial, Color color) {
		modelo = new JugadorHumano(tablero, dinero_inicial);
		modelo.setNombre(nombre);
		modelo.setColor(color);
		vistaCasillero = new VistaCasilleroJugador(color);
		vista = new VistaJugador(this.getNombre(), this.getDineroAsString(), this.getColor());
	}

	public String getNombre() {
		return this.modelo.getNombre();
	}

	public String getDineroAsString() {
		return "$" + String.valueOf(this.modelo.obtenerDinero().obtenerMontoEntero());
	}

	public Color getColor() {
		return this.modelo.getColor();
	}

	@Override
	public void update(Observable o, Object arg) {
		this.vista.actualizarDinero(this.getDineroAsString());
	}

	public VistaCasilleroJugador getVistaCasillero() {
		return this.vistaCasillero;
	}

	public VistaJugador getVista() {
		return this.vista;
	}

	public Jugador getModelo() {
		return this.modelo;
	}

	public void avanzar(int i) {
		this.modelo.avanzar(i);
	}

	public void aplicarEfectoDeCasilleroActual(Cubilete cubilete) {
		this.modelo.aplicarEfectoDeCasilleroActual(cubilete);
	}

	public Encasillable obtenerCasilleroActual() {
		return this.modelo.obtenerCasilleroActual();
	}

	public void comprar(Propiedad propiedad) {
		this.modelo.comprar(propiedad);
	}

	public void pagarFianza() {
		this.modelo.pagarFianza();
	}

	public int getCantidadPropiedades() {
		return this.modelo.getCantidadDePropiedades();
	}

	public int getCantidadEfectivo() {
		return this.modelo.obtenerDinero().obtenerMontoEntero();
	}

	public boolean estaEnCarcel() {
		return this.modelo.estaEncarcelado();
	}

	public void retroceder(int cant_casilleros) {
		this.modelo.retroceder(cant_casilleros);
	}

	public Dinero getDinero() {
		return this.modelo.obtenerDinero();
	}

	public ArrayList<Propiedad> getPropiedades() {
		return this.modelo.getPropiedades();
	}

	public ArrayList<Terreno> getTerrenos() {
		ArrayList<Terreno> terrenos = new ArrayList<Terreno>();
		for (Propiedad propiedad : this.getPropiedades()) {
			if (propiedad instanceof Terreno) {
				terrenos.add((Terreno) propiedad);
			}
		}
		return terrenos;
	}

	public void asociarVista() {
		this.modelo.addObserver(this);
	}

}
