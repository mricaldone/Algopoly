package fiuba.algo3.tp2.vista.partida.tablero;

import fiuba.algo3.tp2.vista.partida.casillero.ContenedorCasillero;
import javafx.scene.paint.Color;


public class FactoryCasilleros {
	
	private ContenedorCasillero carcel;
	private ContenedorCasillero subte;
	private ContenedorCasillero tren;
	private ContenedorCasillero aysa;
	private ContenedorCasillero edesur;
	private ContenedorCasillero buenosairesnorte;
	private ContenedorCasillero buenosairessur;
	private ContenedorCasillero cordobanorte;
	private ContenedorCasillero cordobasur;
	private ContenedorCasillero saltanorte;
	private ContenedorCasillero saltasur;
	private ContenedorCasillero salida;
	private ContenedorCasillero quini6;
	private ContenedorCasillero avancedinamico;
	private ContenedorCasillero policia;
	private ContenedorCasillero santafe;
	private ContenedorCasillero impuestodelujo;
	private ContenedorCasillero neuquen;
	private ContenedorCasillero retrocesodinamico;
	private ContenedorCasillero tucuman;
	
	public FactoryCasilleros() {
		carcel = new ContenedorCasillero("Carcel", Color.GAINSBORO);
		subte = new ContenedorCasillero("Subte", Color.LIGHTBLUE);
		tren = new ContenedorCasillero("Tren", Color.LIGHTBLUE);
		aysa = new ContenedorCasillero("Aysa", Color.LIGHTBLUE);
		edesur = new ContenedorCasillero("Edesur", Color.LIGHTBLUE);
		buenosairesnorte = new ContenedorCasillero("Buenos Aires\nNorte", Color.ORANGE);
		buenosairessur = new ContenedorCasillero("Buenos Aires\nSur", Color.ORANGE);
		cordobanorte = new ContenedorCasillero("Cordoba\nNorte", Color.ORANGE);
		cordobasur = new ContenedorCasillero("Cordoba\nSur", Color.ORANGE);
		saltanorte = new ContenedorCasillero("Salta Norte", Color.ORANGE);
		saltasur = new ContenedorCasillero("Salta Sur", Color.ORANGE);
		salida = new ContenedorCasillero("Salida", Color.GAINSBORO);
		quini6 = new ContenedorCasillero("Quini 6", Color.GAINSBORO);
		avancedinamico = new ContenedorCasillero("Avance\nDinamico", Color.GAINSBORO);
		impuestodelujo = new ContenedorCasillero("Impuesto\nal Lujo", Color.GAINSBORO);
		santafe = new ContenedorCasillero("Santa Fe", Color.ORANGE);
		policia = new ContenedorCasillero("Policia", Color.GAINSBORO);
		neuquen = new ContenedorCasillero("Neuquen", Color.ORANGE);
		retrocesodinamico = new ContenedorCasillero("Retroceso\nDinamico", Color.GAINSBORO);
		tucuman = new ContenedorCasillero("Tucuman", Color.ORANGE);
	}

	public ContenedorCasillero getCarcel() {return carcel;}
	public ContenedorCasillero getSubte() {return subte;}
	public ContenedorCasillero getTren() {return tren;}
	public ContenedorCasillero getAysa() {return aysa;}
	public ContenedorCasillero getEdesur() {return edesur;}
	public ContenedorCasillero getBuenosAiresNorte() {return buenosairesnorte;}
	public ContenedorCasillero getBuenosAiresSur() {return buenosairessur;}
	public ContenedorCasillero getCordobaNorte() {return cordobanorte;}
	public ContenedorCasillero getCordobaSur() {return cordobasur;}
	public ContenedorCasillero getSaltaNorte() {return saltanorte;}
	public ContenedorCasillero getSaltaSur() {return saltasur;}
	public ContenedorCasillero getSalida() {return salida;}
	public ContenedorCasillero getQuini6() {return quini6;}
	public ContenedorCasillero getAvanceDinamico() {return avancedinamico;}
	public ContenedorCasillero getPolicia() {return policia;}
	public ContenedorCasillero getSantaFe() {return santafe;}
	public ContenedorCasillero getImpuestoDeLujo() {return impuestodelujo;}
	public ContenedorCasillero getNeuquen() {return neuquen;}
	public ContenedorCasillero getRestrocesoDinamico() {return retrocesodinamico;}
	public ContenedorCasillero getTucuman() {return tucuman;}

}

