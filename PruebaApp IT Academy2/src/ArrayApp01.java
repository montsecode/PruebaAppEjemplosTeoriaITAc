//ARRAYS EN JAVA
/**
 * Un array multimensionalson mas de un array unidimensional unidos, para que te
hagas una idea, es como si fuera una tabla. Se crea igual que un array
unidimensional, solo hay que añadir un corchete mas con un tamaño en la
definición del array.

 * @author monts
 *
 */
public class ArrayApp01 {

	public static void main(String[] args) {
		// Definimos un array de 3 filas * 5 columnas
		int array[][]=new int[3][5];
		
		//Para asignar un valor, debemos indicar una posición en las filas y columnas. Por
		//Asignamos un 5 al array, en la fila 0 columna 1
		array[0][1]=5;
		
		
		System.out.println(array);


	}

}
