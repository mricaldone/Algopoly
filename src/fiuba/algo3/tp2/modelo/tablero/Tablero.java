package fiuba.algo3.tp2.modelo.tablero;

import fiuba.algo3.tp2.utils.DoublyLinkedCircularList;
import fiuba.algo3.tp2.utils.DoublyLinkedCircularListIterator;

public class Tablero {

	private class IterInternoTablero implements IterTablero {

		private DoublyLinkedCircularListIterator iterador;

		public IterInternoTablero() {
			iterador = casilleros.iterator();
		}

		public Encasillable avanzar() {
			return (Encasillable) iterador.next();
		}

		public Encasillable retroceder() {
			return (Encasillable) iterador.prev();
		}

		public Encasillable verActual() {
			return (Encasillable) iterador.actual();
		}

		public void avanzarHasta(Encasillable casillero_destino) {
			for (int i = 0; i < iterador.size(); i++) {
				if (iterador.actual() == casillero_destino)
					return;
				iterador.next();
			}
		}

	}

	private DoublyLinkedCircularList casilleros;
	private FactoryEncasillables factory;

	public Tablero() {
		casilleros = new DoublyLinkedCircularList();
		factory = new FactoryEncasillables();

		casilleros.add(factory.getSalida());
		casilleros.add(factory.getQuini6());
		casilleros.add(factory.getBuenosAiresSur());
		casilleros.add(factory.getEdesur());
		casilleros.add(factory.getBuenosAiresNorte());
		casilleros.add(factory.getCarcel());
		casilleros.add(factory.getCordobaSur());
		casilleros.add(factory.getAvanceDinamico());
		casilleros.add(factory.getSubte());
		casilleros.add(factory.getCordobaNorte());
		casilleros.add(factory.getImpuestoDeLujo());
		casilleros.add(factory.getSantaFe());
		casilleros.add(factory.getAysa());
		casilleros.add(factory.getSaltaNorte());
		casilleros.add(factory.getSaltaSur());
		casilleros.add(factory.getPolicia());
		casilleros.add(factory.getTren());
		casilleros.add(factory.getNeuquen());
		casilleros.add(factory.getRestrocesoDinamico());
		casilleros.add(factory.getTucuman());
	}

	public IterTablero crearIterador() {
		return new IterInternoTablero();
	}
	
	public FactoryEncasillables getFactory() {
		return factory;
	}
	
}
