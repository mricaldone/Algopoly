package fiuba.algo3.tp2.controlador;

import java.util.ArrayList;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.cubilete.Lanzable;
import fiuba.algo3.tp2.vista.partida.turno.VistaDado;

public class ControladorCubilete {

	private Cubilete cubilete;

	public ControladorCubilete(Cubilete cubilete) {
		this.cubilete = cubilete;
	}

	public ArrayList<VistaDado> getVistasDados() {
		ArrayList<VistaDado> vistas = new ArrayList<VistaDado>();
		for (Lanzable dado : cubilete.getLanzables()) {
			vistas.add(new VistaDado(dado.obtenerValor()));
		}
		return vistas;
	}

	public void lanzar() {
		this.cubilete.lanzar();
	}

	public Cubilete getModelo() {
		return this.cubilete;
	}

	public int sumarValores() {
		return this.cubilete.sumarValores();
	}

}
