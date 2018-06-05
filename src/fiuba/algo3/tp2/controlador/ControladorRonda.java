package fiuba.algo3.tp2.controlador;

import java.util.ArrayList;
import java.util.HashMap;

import fiuba.algo3.tp2.modelo.Jugador;
import fiuba.algo3.tp2.modelo.Ronda;
import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.vista.partida.ronda.ContenedorRonda;

public class ControladorRonda {

	private Ronda modelo_ronda;
	private HashMap<Jugador, ControladorJugador> jugadores;
	private ContenedorRonda vistaRonda;

	public ControladorRonda(Cubilete cubilete) {
		this.jugadores = new HashMap<Jugador, ControladorJugador>();
		this.modelo_ronda = new Ronda(cubilete);
		this.vistaRonda = new ContenedorRonda();
	}

	public ContenedorRonda getVistaRonda() {
		return this.vistaRonda;
	}

	public ArrayList<ControladorJugador> getJugadores() {
		return new ArrayList<ControladorJugador>(jugadores.values());
	}

	public void agregarJugador(ControladorJugador controlador_jugador) {
		Jugador jugador = controlador_jugador.getModelo();
		modelo_ronda.agregarJugador(jugador);
		jugadores.put(jugador, controlador_jugador);
		this.vistaRonda.ponerJugador(controlador_jugador.getVista());
	}

	public ControladorJugador obtenerJugadorActual() {
		return jugadores.get(modelo_ronda.obtenerJugadorActual());
	}

	public ArrayList<Jugador> obtenerJugadores() {
		return modelo_ronda.obtenerJugadores();
	}

	public void quitarJugadorActual() {
		modelo_ronda.quitarJugadorActual();
	}

	public int contarJugadores() {
		return modelo_ronda.contarJugadores();
	}

	public void avanzarTurno() {
		modelo_ronda.avanzarTurno();
	}

	public void reiniciarDobles() {
		modelo_ronda.reiniciar_dobles();
	}

}
