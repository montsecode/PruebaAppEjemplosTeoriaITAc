//ARRAYS EN JAVA
/**
 * 
 * 
 * Al tener un array creado, se rellenan por defecto, por ejemplo, si es un array de int
 *se rellenan con 0, si es un array de String se rellenan con null, ya que String es una
 *clase en realidad.
 * @author monts
 *
 *Tambi�n podemso asignar directamente sus valores, indic�ndolo entre llaves, los valores ir�n separados por comas
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
	//Para acceder a una posici�n, debemos indicar la posici�n mediante un numero
	//	entero entre corchetes.	
		num [0] = 5;
		num [1] = 9;
		System.out.println( num [0]);
		System.out.println( num [1]);
		

	}

}
