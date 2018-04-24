package modelo;

public class Datos {

	private Cola<Colores> cola;
	private Lista<Colores> lista;
	private Pila<Colores> pila;

	public Datos() {
		super();
		cola = new Cola<>();
		lista = new Lista<>();
		pila = new Pila<>();
	}

	public Lista<Colores> getLista() {
		return lista;
	}

	public Pila<Colores> getPila() {
		return pila;
	}

	public Cola<Colores> getCola() {
		return cola;
	}

}
