package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;

import fiuba.algo3.tp2.modelo.cubilete.Cubilete;
import fiuba.algo3.tp2.modelo.encasillables.propiedades.Propiedad;
import fiuba.algo3.tp2.modelo.excepciones.DineroInsuficienteException;
import fiuba.algo3.tp2.modelo.movimiento.Movimiento;
import fiuba.algo3.tp2.modelo.tablero.Encasillable;
import javafx.scene.paint.Color;

public class JugadorNull extends Jugador {

	@Override
	public Dinero obtenerDinero() {
		// TODO Auto-generated method stub
		return null;
	}

	public void comprarCasilleroActual() throws DineroInsuficienteException {
		// TODO Auto-generated method stub
		throw new DineroInsuficienteException();
	}

	@Override
	public Encasillable obtenerCasilleroActual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pagarFianza() throws DineroInsuficienteException {
		// TODO Auto-generated method stub
		throw new DineroInsuficienteException();
	}

	@Override
	public int getCantidadDePropiedades() {
		return 0;
	}

	@Override
	public void aplicarEfectoDeCasilleroActual(Cubilete cubilete) throws DineroInsuficienteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar(Dinero monto) throws DineroInsuficienteException {
		throw new DineroInsuficienteException();
	}

	@Override
	public void avanzarHasta(Encasillable casillero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cobrar(Dinero monto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void avanzar(int cant_casilleros) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retroceder(int cant_casilleros) {
		// TODO Auto-generated method stub

	}

	@Override
	public void comprar(Propiedad comprable) throws DineroInsuficienteException {
		// TODO Auto-generated method stub
		throw new DineroInsuficienteException();
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void entregarPropiedad(Jugador destinatario, Propiedad propiedad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarPropiedad(Propiedad propiedad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esNull() {
		return true;
		//TODO VER CUAL SIRVE PORQUE ESTA REPETIDO
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.TRANSPARENT;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movimiento getMovimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMovimiento(Movimiento movimiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avisarCambioDeTurno() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ArrayList<String> getListaComprables(){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Propiedad> getPropiedades() {
		return new ArrayList<Propiedad>();
	}

	@Override
	public void quitarPropiedad(Propiedad propiedad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dinero obtenerPatrimonio() {
		return new Dinero(0);
	}

	@Override
	public boolean estaEncarcelado() {
		return false;
	}

}
