package control;

import control.acciones.Baraja;
import control.acciones.Borra;
import control.acciones.Pide;
import control.acciones.Seleccion;
import modelo.Colores;
import vista.UI;

public class ParaUI extends UI{
	Game game;
	MyActionListener listener;
	Seleccion seleccion= new Seleccion();
	Pide pide= new Pide();
	Baraja baraja= new Baraja();
	Borra borra= new Borra();
	public ParaUI() {
		super();
		this.game = new Game();
		this.listener=new MyActionListener();
		prepararGame();
		jugar();
	}
	private void jugar() {
		
		
	}
	private void prepararGame() {
		for (int i = 0; i < utiles.Constantes.TAMANO_COLA; i++) {
			Colores color = Colores.amarillo;
			game.addMonedaEnColaT(color);//TODO
			
		}
	
		
	}

	
	
}
