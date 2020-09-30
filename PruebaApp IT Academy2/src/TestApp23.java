//ARRAYS EN JAVA

/**
 * 
 * Para recorrer un array usamos un bucle, donde lo único que variaremos sera la
*  posición. Veamos un ejemplo de rellenar un array de 10 posiciones con múltiplos de
*  5.

 * @author monts
 *
 */
public class TestApp23 {

	public static void main(String[] args) {
		// Definimos un array con 10 posiciones
		int num []=new int[10];
		//Recorremos el array
		//array.lenght indica la longitud del array, en este caso
		for(int i=0, multiplo=5; i<num.length;i++,multiplo+=5) {
			num[i]=multiplo;
			System.out.println(num[i]);
			
		}

	}

}
