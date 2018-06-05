package fiuba.algo3.tp2.modelo.cubilete;

import fiuba.algo3.tp2.utils.LinkedCircularList;
import fiuba.algo3.tp2.utils.LinkedCircularListIterator;

public class DadoCargado implements Lanzable {

	private LinkedCircularList nros_esperados;
	private LinkedCircularListIterator valor_mostrado;
	
	public DadoCargado(int valor_esperado) {
		nros_esperados = new LinkedCircularList();
		nros_esperados.add(valor_esperado);
		valor_mostrado = nros_esperados.iterator();
	}

	public DadoCargado(int[] valores_esperados) {
		nros_esperados = new LinkedCircularList();
		for(int valor_esperado:valores_esperados) {
			nros_esperados.add(valor_esperado);
		}
		valor_mostrado = nros_esperados.iterator();
	}

	@Override
	public void lanzar() {
		valor_mostrado.next();
	}

	@Override
	public int obtenerValor() {
		return (int)valor_mostrado.actual();
	}

}
