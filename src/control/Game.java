package control;

import control.interfaces.Gameable;
import modelo.Colores;
import modelo.Datos;

public class Game implements Gameable{

	Datos datos;

	public Game() {
		super();
		datos=new Datos();
	}
	
	@Override
	public void addMonedaEnCola(){
		// TODO Auto-generated method stub
	}
	
	public void addMonedaEnColaT(Colores color) {//TODO borrar
		datos.getCola().encolar(color);
	}

	@Override
	public void addMonedaEnPila() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMonedaEnLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMonedaEnCola() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMonedaEnPila() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprobarIgualesEnLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarMonedaEnLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementarMonedas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprobarWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarLose() {
		// TODO Auto-generated method stub
		return false;
	}

}
