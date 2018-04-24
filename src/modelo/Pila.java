package modelo;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Stack;
import java.util.concurrent.DelayQueue;

import vista.JLabelModel;

public class Pila<T> {
	private Stack<T> pilaUno = new Stack();
	private Stack<T> pilaDos = new Stack();
	
	
	private int Sorteo() {
		int min = 0, max = 1;
		return (int) Math.random() * (max - min) + min;
	}
	

	public void encolar(T t ) {
		if (Sorteo()==0&&pilaUno.size()<4){
			this.pilaUno.push(t);
		}
		else{
			this.pilaDos.push(t);
		}
		
		
	}

	// private void CambioStack(Stack pilaUno, Stack pilaAux) {
	// if(!pilaUno.isEmpty()) {
	// JLabelModel label = (JLabelModel) pilaUno.pop();
	//
	// CambioStack(pilaUno, pilaAux);
	// pilaAux.push(label);
	// }
	// Collections.reverse(pilaAux);
	// //return pilaAux.pop();
	//
	// }
	public T desencolar(T t) {
		if(Sorteo()==0) {
			return this.pilaUno.pop();
		}
		else {
			return this.pilaDos.pop();
		}
		
	}

	public Collection<T> getPila() {
		return pilaUno;
	}

}
