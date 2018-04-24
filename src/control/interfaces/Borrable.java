package control.interfaces;

import modelo.Colores;

public interface Borrable {
	/**
	 * borra de la lista un color elegido por el usuario 
	 * 2 usos
	 * @param Color el color elegido a borrar
	 */
	public boolean borrarColor(Colores Color);
}
