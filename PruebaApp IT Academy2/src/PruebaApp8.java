//OPERADORES EN JAVA

/**
 * Condicional: son operadores que permiten concatenar más de una condición.
 * Los operadores son:
 * 
 * @author monts
 *
 */
public class PruebaApp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1=10;
		
		int op2=20;
		
		int op3=10;
		
		boolean result;
		
		//result = op1==10 && op2<30;
		//resltado true
		//result = op1!=30  || op3==15;
		
		result = op1==op3 && op2<=30 || op2>=15;
		
		System.out.println(result);

	}

}
