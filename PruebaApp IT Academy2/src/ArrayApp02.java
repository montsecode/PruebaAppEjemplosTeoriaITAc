//ARRAYS EN JAVA

/**
 * 
 * También existe una forma de realizar las dos anteriores acciones de una forma más
rápida. Esta es su sintaxis:
 * @author monts
 *
 */
 
public class ArrayApp02 {

	public static void main(String[] args) {
		// Definimos un array de 3 filas * 5 columnas
		int array[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		//Para recorrer un array, debemos usar un bucle anidado, donde el primer bucle
		//controla las filas y el de dentro las columnas.
		// Recorremos el array multidimensional
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.println(array[1][j]);
			}
		}
		
		
	}
	   
}
