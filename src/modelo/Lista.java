package modelo;

import java.util.Collection;
import java.util.LinkedList;

public class Lista<T> {	
	private LinkedList<T> lista = new LinkedList<>();

public void encolar(T t) {
	this.lista.add(t);
}
public T desencolar(int index){
	return this.lista.remove(index);
}
public Collection<T> getLista(){
	return lista;
}

}
