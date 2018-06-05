package fiuba.algo3.tp2.utils;

public class LinkedCircularList {
	
	private static class Node {
		
		private Node next;
		private Object data;
		
		public Node(Object element) {
			this.next = null;
			this.data = element;
		}
		
	}
	
	private class InnerIterator implements LinkedCircularListIterator {
		
		private Node actual;
		private Node anterior;
		
		public InnerIterator() {
			actual = null;
			anterior = null;
		}
		
		public Object next() {
			if(actual == null) {
				actual = primer_nodo;
				anterior = ultimo_nodo;
				return actual();
			}
			anterior = actual;
			actual = actual.next;
			return actual.data;
		}
		
		public Object actual() {
			if(actual == null) return ultimo_nodo.data;
			return actual.data;
		}
		
		public void remove() {
			if(actual == null) return;
			len --;
			Node nodo_siguiente = actual.next;
			actual = nodo_siguiente;
			anterior.next = actual;
		}

		public int size() {
			return len;
		}
		
	}

	private Node ultimo_nodo;
	private Node primer_nodo;
	private int len;
	
	public LinkedCircularList(){
		primer_nodo = null;
		ultimo_nodo = primer_nodo;
		len = 0;
	}
	
	public void add(Object element) {
		Node nuevo_nodo = new Node(element);
		len ++;
		if(primer_nodo == null)
			primer_nodo = nuevo_nodo;
		else
			ultimo_nodo.next = nuevo_nodo;
		nuevo_nodo.next = primer_nodo;
		ultimo_nodo = nuevo_nodo;
	}
	
	public LinkedCircularListIterator iterator() {
		return new InnerIterator();
	}

}
