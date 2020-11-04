package it.unical.ProvaIngSw;

import java.util.Comparator;
import java.util.List;


public class MyListUtil {
	
	
	public List<Integer> ordinaLista(List<Integer> lista, boolean scelta) {
		
		Comparator<Integer> comparaCres = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				
				if (o1 < o2)
					return -1;
				
				else return 1;
			
//				return 0;
			}
		};
		
		Comparator<Integer> comparaDecr = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				
				
				if (o1 < o2)
					return 1;
				
				return -1;
				
//				return 0;
			}
		};

		if (scelta) {
			lista.sort(comparaCres);
		}
		
		else lista.sort(comparaDecr);
		
		return lista;
	}

}
