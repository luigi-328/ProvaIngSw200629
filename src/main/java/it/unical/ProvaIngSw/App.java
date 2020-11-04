package it.unical.ProvaIngSw;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       MyListUtil test = new MyListUtil();
       List<Integer> lista = new LinkedList<Integer>();
       lista.add(3);
       lista.add(1);
       lista.add(4);
       lista.add(2);
       lista = test.ordinaLista(lista, false);
       for(int i = 0; i < lista.size(); i++) 
    	   System.out.println(lista.get(i));
    }
}
