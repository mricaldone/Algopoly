package fiuba.algo3.tp2.utils;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public interface DoublyLinkedCircularListIterator extends Iterator {
	public Object next();
	public Object prev();
	public Object actual();
	public void remove();
	public int size();
}
