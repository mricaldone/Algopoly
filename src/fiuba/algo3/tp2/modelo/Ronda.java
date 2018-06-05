package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.excepciones.NoHayJugadoresException;

import fiuba.algo3.tp2.utils.LinkedCircularList;
import fiuba.algo3.tp2.utils.LinkedCircularListIterator;

public class Ronda extends Observable implements Iterable<Jugador> {

	private LinkedCircularList datos;
	private LinkedCircularListIterator iterador;
	private Cubilete cubilete;
	private int cant_dobles;
	
	public Ronda(Cubilete cubilete) {
		this.datos = new LinkedCircularList();
		this.iterador = this.datos.iterator();
		this.cant_dobles = 0;
		this.cubilete = cubilete;
	}
	
	public void reiniciar_dobles() {
		this.cant_dobles = 0;
	}

	public void agregarJugador(Jugador jugador) {
		datos.add(jugador);
		this.iterador = datos.iterator();
		this.iterador.next();
	}

	public void avanzarTurno() throws NoHayJugadoresException {
		if(cubilete.esDoble()) {
			cant_dobles++;
			if(cant_dobles == 1) return;
		}
		Jugador actual = (Jugador) iterador.actual();
		actual.avisarCambioDeTurno();
		iterador.next();
		this.cant_dobles = 0;
		setChanged();
		notifyObservers();
	}

	public Jugador obtenerJugadorActual() throws NoHayJugadoresException {
		try {
			return (Jugador) this.iterador.actual();
		} catch (Exception e) {
			throw new NoHayJugadoresException();
		}
	}
	
	public ArrayList<Jugador> obtenerJugadores(){
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		for(int i = 0; i < iterador.size(); i++) {
			jugadores.add((Jugador)iterador.actual());
			iterador.next();
		}
		return jugadores;
	}

	@Override
	public Iterator<Jugador> iterator() {
		return obtenerJugadores().iterator();
	}

	public void quitarJugadorActual() {
		iterador.remove();
	}

	public int contarJugadores() {
		return iterador.size();
	}
}
