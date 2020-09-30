import java.lang.reflect.Array;

//ARRAYS EN JAVA

/**
 * 
 * ¿Podemos recorrer una sola fila o columna del array? Si podemos, para ello solo
tenemos que usar un bucle, indicando que es lo que vamos a recorrer.

 * @author monts
 *
 */
public class ArrayApp03 {

	public static void main(String[] args) {
		// Definios un array de 3 filas x 5 columnas
		int array[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		//Recorremos la primera columna de todas las filas
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i][0]);
			
		}
		
		//Recorremos todas las columnas de la segunda fila
		for(int i=0;i<array[0].length;i++) {
			System.out.println(array[1][i]);
		}

	}

}
