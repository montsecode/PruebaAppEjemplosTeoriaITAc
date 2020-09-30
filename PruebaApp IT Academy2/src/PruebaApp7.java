//OPERADORES EN JAVA

/**
 * Relación: son oepradores para comparar valores, de esta comparación
 * se crea una variable booleana.
 * 
 * @author monts
 *
 */
public class PruebaApp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador1=10;
		
		int operador2=20;
		
		int operador3=10;
		
		boolean resultado;
		
		resultado = operador1 == operador2;
		resultado = operador1==operador3;
		resultado = operador1!=operador2;
		resultado = operador1>operador2;
		resultado = operador1>operador3;
		resultado = operador1<operador2;
		resultado = operador1<=operador3;
		resultado = operador1>=operador2;
		
		
		System.out.println(resultado);
		System.out.println(resultado);
		System.out.println(resultado);
		System.out.println(resultado);
		System.out.println(resultado);
		System.out.println(resultado);
		System.out.println(resultado);
		System.out.println(resultado);
		
	}

}
