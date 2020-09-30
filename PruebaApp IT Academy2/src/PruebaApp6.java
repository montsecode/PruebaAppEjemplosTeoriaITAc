//OPERADORES EN JAVA
/**
 * Unarios:requieren un solo operando, existe el operador ++ y --.
 * Es similar a sumar o restar una unidad a la 
 * variable. Tened en cuenta que el orden del oeprador
 * es importante, ejemplo:
 * @author monts
 *
 */
public class PruebaApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador=10;
		int x=0;
		operador++;
		operador++;
		operador--;
		
		x=operador++;
		
		x=++operador;
		
		System.out.println(operador);
		
		
	}

}
