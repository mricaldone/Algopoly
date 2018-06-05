package fiuba.algo3.tp2.utils;

public class DoublyLinkedCircularList {
	
	private static class Node {
		
		private Node next;
		private Node prev;
		private Object data;
		
		
		public Node(Object element) {
			this.next = null;
			this.prev = null;
			this.data = element;
		}
		
	}
	private Node primer_nodo;
	private int len;
	
	private class InnerIterator implements DoublyLinkedCircularListIterator {
		
		private Node actual;

		
		public InnerIterator() {
			actual = primer_nodo;
		}
		
		public Object next() {
			actual = actual.next;
			return actual.data;
		}
		
		public Object prev() {
			actual = actual.prev;
			return actual.data;
		}
		
		public Object actual() {
			return actual.data;
		}
		
		public void remove() {
			if(actual == null) return;
			len --;
			Node nodo_anterior = actual.prev;
			Node nodo_siguiente = actual.next;
			if(nodo_anterior == nodo_siguiente) {
				primer_nodo = actual = null;
				return;
			}
			nodo_anterior.next = nodo_siguiente;
			nodo_siguiente.prev = nodo_anterior;
			actual = nodo_siguiente;
		}

		public int size() {
			return len;
		}

		@Override
		public boolean hasNext() {
			return !(this.actual==primer_nodo);
		}
		
	}


	
	public DoublyLinkedCircularList(){
		primer_nodo = null;
		len = 0;
	}
	
	public void add(Object element) {
		Node nuevo_nodo = new Node(element);
		len ++;
		if(primer_nodo == null) {
			primer_nodo = nuevo_nodo;
			primer_nodo.next = primer_nodo;
			primer_nodo.prev = primer_nodo;
			return;
		}
		Node ultimo_nodo = primer_nodo.prev;
		ultimo_nodo.next = nuevo_nodo;
		primer_nodo.prev = nuevo_nodo;
		nuevo_nodo.prev = ultimo_nodo;
		nuevo_nodo.next = primer_nodo;
	}
	
	public DoublyLinkedCircularListIterator iterator() {
		return new InnerIterator();
	}

}
