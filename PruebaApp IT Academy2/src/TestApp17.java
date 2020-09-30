import com.sun.org.apache.xpath.internal.operations.Variable;

//METODOS EN JAVA
/**
 * 
 * Los métodos en Java nos sirven para ejecutar instrucciones mediante unos
 * parámetros que nosotros le damos ( a veces, no es necesario incluir parámetros)
 * Los métodos se definen fuera del MAIN, debemos que indicarle qeu es lo que queremos que tipo de dato 
 * o referencia devuelva, ya sea un int, String, un objeto, un array, etc después el nombre
 * del MÉTODO y por último los parámentros que utilizara el método,
 *  estos PARÁMETROS son los valores que le daremos desde el MAIN.
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
		
	  //Devuelva un INT cuando ponemos que devuelva un VALOR debemos poner algún RETURN con el tipo de valor que ponemos a devolver.
	//	En RETURN podemos poner una formula o una Variable.class Sigamos con el ejmplo:
			
		int resultado=num1 + num2;
		return resultado;
//Ya tenemos el método, pero ahora debemos invocarlo en le MAIN, ya que sino no serviría de nada. Para invocrlo, escribimos el nombre en el MAIL y le pasamos
	//	lso parámetros que necesite, no podemos ni quitarle ni añadirle mas de los que necesita, ya que sino dará un error en la combinación
	
	//	int operador1=3;
		//int operador2=5;
		//sumaNumeros(operador1,operador2);
	}

}
