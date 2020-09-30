import com.sun.org.apache.xpath.internal.operations.Variable;

//METODOS EN JAVA
/**
 * 
 * Los m�todos en Java nos sirven para ejecutar instrucciones mediante unos
 * par�metros que nosotros le damos ( a veces, no es necesario incluir par�metros)
 * Los m�todos se definen fuera del MAIN, debemos que indicarle qeu es lo que queremos que tipo de dato 
 * o referencia devuelva, ya sea un int, String, un objeto, un array, etc despu�s el nombre
 * del M�TODO y por �ltimo los par�mentros que utilizara el m�todo,
 *  estos PAR�METROS son los valores que le daremos desde el MAIN.
 *  
 * @author monts
 *
 */
public class TestApp17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operador1=3;
		int operador2=5;
		int resultado= sumaNumeros(operador1,operador2);
		
		System.out.println("El resultado de la suma es "+resultado);
	}
	public static int sumaNumeros(int num1, int num2) {
		
	  //Devuelva un INT cuando ponemos que devuelva un VALOR debemos poner alg�n RETURN con el tipo de valor que ponemos a devolver.
	//	En RETURN podemos poner una formula o una Variable.class Sigamos con el ejmplo:
			
		int resultado=num1 + num2;
		return resultado;
//Ya tenemos el m�todo, pero ahora debemos invocarlo en le MAIN, ya que sino no servir�a de nada. Para invocrlo, escribimos el nombre en el MAIL y le pasamos
	//	lso par�metros que necesite, no podemos ni quitarle ni a�adirle mas de los que necesita, ya que sino dar� un error en la combinaci�n
	
	//	int operador1=3;
		//int operador2=5;
		//sumaNumeros(operador1,operador2);
	}

}
