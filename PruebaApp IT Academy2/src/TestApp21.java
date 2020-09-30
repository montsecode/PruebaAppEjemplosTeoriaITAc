//ARRAYS EN JAVA
/**
 * 
 * 
 * Al tener un array creado, se rellenan por defecto, por ejemplo, si es un array de int
 *se rellenan con 0, si es un array de String se rellenan con null, ya que String es una
 *clase en realidad.
 * @author monts
 *
 *También podemso asignar directamente sus valores, indicándolo entre llaves, los valores irán separados por comas
 *Por ejemplo:
 *
 *Tipo_dato nombre_array[]={valor1,valor2,valor3};
 *
 *
 *
 */
public class TestApp21 {

	public static void main(String[] args) {
		// Definimos un array con 5 posiciones
		int num[]= {5,6,5,2,3};
	//Para acceder a una posición, debemos indicar la posición mediante un numero
	//	entero entre corchetes.	
		num [0] = 5;
		num [1] = 9;
		System.out.println( num [0]);
		System.out.println( num [1]);
		

	}

}
