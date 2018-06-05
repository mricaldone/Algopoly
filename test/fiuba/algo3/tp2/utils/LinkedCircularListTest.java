package fiuba.algo3.tp2.utils;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedCircularListTest {
	
	@Test
	public void testCircularListDeUnElementoConUnIteradorUsandoNext() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		LinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add((Integer) iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,1,1,1,1,1,1,1,1,1}, resultado.toArray());
	}
	
	@Test
	public void testCircularListDeDosElementosConUnIteradorUsandoNext() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		LinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			iterator.next();
			resultado.add((Integer) iterator.actual());
		}
		Assert.assertArrayEquals(new Object[]{1,2,1,2,1,2,1,2,1,2}, resultado.toArray());
	}
	
	@Test
	public void testCircularListDeTresElementosConUnIteradorUsandoNext() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		LinkedCircularListIterator iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			iterator.next();
			resultado.add((Integer) iterator.actual());
		}
		Assert.assertArrayEquals(new Object[]{1,2,3,1,2,3,1,2,3,1}, resultado.toArray());
	}
	
	@Test
	public void testCircularListDeCuatroElementoConDosIteradoresUsandoNext() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		LinkedCircularListIterator iterator1 = list.iterator();
		LinkedCircularListIterator iterator2 = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		iterator1.next();
		iterator2.next();
		for(int i = 0;i<5;i++) {
			resultado.add((Integer) iterator1.next());//24242
			resultado.add((Integer) iterator2.next());//23412
			resultado.add((Integer) iterator1.next());//31313
		}
		Assert.assertArrayEquals(new Object[]{2,2,3,4,3,1,2,4,3,4,1,1,2,2,3}, resultado.toArray());
	}
	
	@Test
	public void testCircularListDeCuatroElementosElActualEsElUltimoDespuesDeCrear() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		LinkedCircularListIterator iterator = list.iterator();
		Assert.assertEquals(4,iterator.actual());
	}
	
	@Test
	public void testCircularListDeTresElementosRemueveAlPrimero() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		LinkedCircularListIterator iterator = list.iterator();
		iterator.next();
		iterator.remove();
		Assert.assertEquals(2,iterator.actual());
		iterator.next();
		Assert.assertEquals(3,iterator.actual());
		iterator.next();
		Assert.assertEquals(2,iterator.actual());
	}
	
	@Test
	public void testCircularListDeTresElementosRemueveAlSegundo() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		LinkedCircularListIterator iterator = list.iterator();
		iterator.next();
		iterator.next();
		iterator.remove();
		Assert.assertEquals(3,iterator.actual());
		iterator.next();
		Assert.assertEquals(1,iterator.actual());
		iterator.next();
		Assert.assertEquals(3,iterator.actual());
	}
	
	@Test
	public void testCircularListDeTresElementosRemueveAlTercero() {
		LinkedCircularList list = new LinkedCircularList();
		list.add(1);
		list.add(2);
		list.add(3);
		LinkedCircularListIterator iterator = list.iterator();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.remove();
		Assert.assertEquals(1,iterator.actual());
		iterator.next();
		Assert.assertEquals(2,iterator.actual());
		iterator.next();
		Assert.assertEquals(1,iterator.actual());
	}

}
