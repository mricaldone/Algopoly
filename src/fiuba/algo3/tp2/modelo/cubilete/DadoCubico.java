package fiuba.algo3.tp2.modelo.cubilete;

import java.util.Random;

public class DadoCubico implements Lanzable {

	//INVARIANTES: EL DADO SIEMPRE TIENE UN VALOR ENTRE 1 Y 6
	
	private int numero_mostrado;
	
	public DadoCubico() {
		//CONSTRUYE UN DADO VALIDO DE 6 CARAS
		this.lanzar();
	}
	
	@Override
	public void lanzar() {
		Random random = new Random();
        this.numero_mostrado = random.nextInt(6) + 1;
	}

	@Override
	public int obtenerValor() {
		return this.numero_mostrado;
	}

}
