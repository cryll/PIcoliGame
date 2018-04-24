package control.interfaces;

public interface Gameable {

	/**
	 * introduce una moneda en la cola
	 */
	public void addMonedaEnCola();

	/**
	 * introduce una moneda en la pila
	 */
	public void addMonedaEnPila();

	/**
	 * introduce una moneda en la lista
	 */
	public void addMonedaEnLista();

	/**
	 * quita una moneda de la cola
	 */
	public void removeMonedaEnCola();

	/**
	 * quita una moneda de una de las pilas
	 */
	public void removeMonedaEnPila();

	/**
	 * comprueba si dos monedas consecutivas de la lista son iguales
	 */
	public void comprobarIgualesEnLista();

	/**
	 * elimina una moneda de la lista
	 */
	public void borrarMonedaEnLista();

	/**
	 * incrementa el numero de monedas(pts)
	 */
	public void incrementarMonedas();

	/**
	 * comprueba si ganas el juego, 
	 * @return true monedas(pts) >= requisito
	 */
	public boolean comprobarWin();

	/**
	 * comprueba si se pierde el juego
	 * @return true monedas > requisito
	 */
	public boolean comprobarLose();

}
