//ARRAYLIST EN JAVA


package ejemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class EjemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>lista = new ArrayList<>();
		
		//Metodo add. a�ade elementos a nuestra lista
		lista.add(1);
		lista.add(2);
		lista.add(3);

		System.out.println("ADD");
		System.out.println(lista.toString());
		
		//M�odo remove, elimina elementos de nuestra lista mediante indice
		lista.remove(2);// Elimino el �ltimo elemento, no el elemento 2
		
		System.out.println("REMOVE");
		System.out.println(lista.size());
		
		//M�todo get, devolvemos un elemento de un �ndice
		
		System.out.println("GET");
		System.out.println(lista.get(0));//Primer elemento
		
		//M�todo Iterator, �til para recorrer un arrayList
		
		System.out.println("ITERATOR");
		Iterator<Integer> it = lista.iterator();
		int num;
		while (it.hasNext()) {
			num = it.next();
			System.out.println(num);
			
		//M�todo indexOf, �til para saber la posici�n de un elemento
			
		System.out.println("INDEXOF");
		System.out.println(lista.indexOf(1));
		
		//M�todo Clear, elimina todos los elementos
		lista.clear();
		
		System.out.println("CLEAR");
		System.out.println(lista.toString());
		
		}
	}

}
