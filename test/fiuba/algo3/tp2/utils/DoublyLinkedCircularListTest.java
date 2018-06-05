package fiuba.algo3.tp2.utils;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class DoublyLinkedCircularListTest {
	
	@Test
	public void testDoublyCircularListDeUnElementoConUnIteradorUsandoNext() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		DoublyLinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,1,1,1,1,1,1,1,1,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeUnElementoConUnIteradorUsandoPrev() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		DoublyLinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.prev();
		}
		Assert.assertArrayEquals(new Object[]{1,1,1,1,1,1,1,1,1,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeDosElementosConUnIteradorUsandoNext() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		list.add(2);
		DoublyLinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,2,1,2,1,2,1,2,1,2}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeDosElementosConUnIteradorUsandoPrev() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		list.add(2);
		DoublyLinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.prev();
		}
		Assert.assertArrayEquals(new Object[]{1,2,1,2,1,2,1,2,1,2}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeTresElementosConUnIteradorUsandoNext() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		DoublyLinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,2,3,1,2,3,1,2,3,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeTresElementosConUnIteradorUsandoPrev() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		DoublyLinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.prev();
		}
		Assert.assertArrayEquals(new Object[]{1,3,2,1,3,2,1,3,2,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeCutroElementoConDosIteradoresUsandoNext() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		DoublyLinkedCircularListIterator iterator1 = list.iterator();
		DoublyLinkedCircularListIterator iterator2 = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<5;i++) {
			resultado.add((Integer) iterator1.next());//24242
			resultado.add((Integer) iterator2.next());//23412
			resultado.add((Integer) iterator1.next());//31313
		}
		Assert.assertArrayEquals(new Object[]{2,2,3,4,3,1,2,4,3,4,1,1,2,2,3}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeCutroElementoConDosIteradoresUsandoPrev() {
		DoublyLinkedCircularList list = new DoublyLinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		DoublyLinkedCircularListIterator iterator1 = list.iterator();
		DoublyLinkedCircularListIterator iterator2 = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<5;i++) {
			resultado.add((Integer) iterator1.prev());//42424
			resultado.add((Integer) iterator2.prev());//43214
			resultado.add((Integer) iterator1.prev());//31313
		}
		Assert.assertArrayEquals(new Object[]{4,4,3,2,3,1,4,2,3,2,1,1,4,4,3}, resultado.toArray());
	}

}
