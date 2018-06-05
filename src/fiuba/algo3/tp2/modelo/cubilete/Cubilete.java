package fiuba.algo3.tp2.modelo.cubilete;

import java.util.ArrayList;

public class Cubilete {
	
	private ArrayList<Lanzable> dados;
	
	public Cubilete() {
		this.dados = new ArrayList<Lanzable>();
	}

	public void agregar(Lanzable dado) {
		this.dados.add(dado);
	}

	public void lanzar() {
		for(Lanzable dado:dados) {
			dado.lanzar();
		}
	}

	public int sumarValores() {
		int valores_sumados = 0;
		for(Lanzable dado:dados) {
			valores_sumados += dado.obtenerValor();
		}
		return valores_sumados;
	}
		
	public ArrayList<Lanzable> getLanzables(){
		return this.dados;
	}

	public boolean esDoble() {
		int valor = dados.get(0).obtenerValor();
		for(int i=1;i<dados.size();i++) {
			if(valor != dados.get(i).obtenerValor()) return false;
		}
		return true;
	}
	
}
