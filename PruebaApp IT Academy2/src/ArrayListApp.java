//ARRAYLIST EN JAVA

/**
 * ArrayList<String> listaMensajes=new ArrayList<String>();
 *  
 * 
 * @author monts
 *
 */

import java.util.ArrayList;
public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista=new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		for(Object o:lista) {
			System.out.println(o);
		}
		
	}

}
