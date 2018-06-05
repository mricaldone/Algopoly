package fiuba.algo3.tp2.modelo.tablero;

import fiuba.algo3.tp2.modelo.encasillables.AvanceDinamico;
import fiuba.algo3.tp2.modelo.encasillables.Carcel;
import fiuba.algo3.tp2.modelo.encasillables.ImpuestoDeLujo;
import fiuba.algo3.tp2.modelo.encasillables.Policia;
import fiuba.algo3.tp2.modelo.encasillables.Quini6;
import fiuba.algo3.tp2.modelo.encasillables.RetrocesoDinamico;
import fiuba.algo3.tp2.modelo.encasillables.Salida;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Aysa;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Edesur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Subte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.servicios.Tren;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.BuenosAiresSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.CordobaNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.CordobaSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.SaltaNorte;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_dobles.SaltaSur;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Neuquen;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.SantaFe;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.terrenos_simples.Tucuman;

public class FactoryEncasillables {
	
	private Carcel carcel;
	private Subte subte;
	private Tren tren;
	private Aysa aysa;
	private Edesur edesur;
	private BuenosAiresNorte buenosairesnorte;
	private BuenosAiresSur buenosairessur;
	private CordobaNorte cordobanorte = new CordobaNorte();
	private CordobaSur cordobasur = new CordobaSur();
	private SaltaNorte saltanorte = new SaltaNorte();
	private SaltaSur saltasur = new SaltaSur();
	private Salida salida;
	private Quini6 quini6;
	private AvanceDinamico avancedinamico;
	private Policia policia;
	private SantaFe santafe;
	private ImpuestoDeLujo impuestodelujo;
	private Neuquen neuquen;
	private RetrocesoDinamico retrocesodinamico;
	private Tucuman tucuman;
	

	public FactoryEncasillables() {
		carcel = new Carcel();
		subte = new Subte();
		tren = new Tren();
		aysa = new Aysa();
		edesur = new Edesur();
		buenosairesnorte = new BuenosAiresNorte();
		buenosairessur = new BuenosAiresSur();
		cordobanorte = new CordobaNorte();
		cordobasur = new CordobaSur();
		saltanorte = new SaltaNorte();
		saltasur = new SaltaSur();
		salida = new Salida();
		quini6 = new Quini6();
		avancedinamico = new AvanceDinamico();
		impuestodelujo = new ImpuestoDeLujo();
		santafe = new SantaFe();
		policia = new Policia(carcel);
		neuquen = new Neuquen();
		retrocesodinamico = new RetrocesoDinamico();
		tucuman = new Tucuman();
		this.emparejar();
	}
	
	private void emparejar() {
		tren.setPareja(subte);
		subte.setPareja(tren);
		aysa.setPareja(edesur);
		edesur.setPareja(aysa);
		buenosairesnorte.setPareja(buenosairessur);
		buenosairessur.setPareja(buenosairesnorte);
		cordobanorte.setPareja(cordobasur);
		cordobasur.setPareja(cordobanorte);
		saltanorte.setPareja(saltasur);
		saltasur.setPareja(saltanorte);
	}

	public Encasillable getCarcel() {return carcel;}
	public Encasillable getSubte() {return subte;}
	public Encasillable getTren() {return tren;}
	public Encasillable getAysa() {return aysa;}
	public Encasillable getEdesur() {return edesur;}
	public Encasillable getBuenosAiresNorte() {return buenosairesnorte;}
	public Encasillable getBuenosAiresSur() {return buenosairessur;}
	public Encasillable getCordobaNorte() {return cordobanorte;}
	public Encasillable getCordobaSur() {return cordobasur;}
	public Encasillable getSaltaNorte() {return saltanorte;}
	public Encasillable getSaltaSur() {return saltasur;}
	public Encasillable getSalida() {return salida;}
	public Encasillable getQuini6() {return quini6;}
	public Encasillable getAvanceDinamico() {return avancedinamico;}
	public Encasillable getPolicia() {return policia;}
	public Encasillable getSantaFe() {return santafe;}
	public Encasillable getImpuestoDeLujo() {return impuestodelujo;}
	public Encasillable getNeuquen() {return neuquen;}
	public Encasillable getRestrocesoDinamico() {return retrocesodinamico;}
	public Encasillable getTucuman() {return tucuman;}

}