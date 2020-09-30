//ARRAYLIST EN JAVA


package ejemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class EjemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>lista = new ArrayList<>();
		
		//Metodo add. añade elementos a nuestra lista
		lista.add(1);
		lista.add(2);
		lista.add(3);

		System.out.println("ADD");
		System.out.println(lista.toString());
		
		//Méodo remove, elimina elementos de nuestra lista mediante indice
		lista.remove(2);// Elimino el último elemento, no el elemento 2
		
		System.out.println("REMOVE");
		System.out.println(lista.size());
		
		//Método get, devolvemos un elemento de un índice
		
		System.out.println("GET");
		System.out.println(lista.get(0));//Primer elemento
		
		//Método Iterator, útil para recorrer un arrayList
		
		System.out.println("ITERATOR");
		Iterator<Integer> it = lista.iterator();
		int num;
		while (it.hasNext()) {
			num = it.next();
			System.out.println(num);
			
		//Método indexOf, útil para saber la posición de un elemento
			
		System.out.println("INDEXOF");
		System.out.println(lista.indexOf(1));
		
		//Método Clear, elimina todos los elementos
		lista.clear();
		
		System.out.println("CLEAR");
		System.out.println(lista.toString());
		
		}
	}

}
