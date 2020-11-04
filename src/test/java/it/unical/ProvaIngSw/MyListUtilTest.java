package it.unical.ProvaIngSw;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil myList;
	
	@BeforeClass
	public static void prepare() {
		myList = new MyListUtil();
	}
	
	
	@Test
	public void ordinaListaWork() {
		List<Integer> lista = new LinkedList<Integer>();
	       lista.add(3);
	       lista.add(1);
	       lista.add(4);
	       lista.add(2);
	       
	       
		assertEquals(Arrays.asList(1, 2, 3, 4), 
				myList.ordinaLista(lista, true));
		
		assertEquals(Arrays.asList(4, 3, 2, 1),
				myList.ordinaLista(lista, false));
		
		lista.clear();
		lista.add(1);
		lista.add(2);
		
		
		assertEquals(Arrays.asList(2, 1),
				myList.ordinaLista(lista, false));
		
		
	}
	
	
}
