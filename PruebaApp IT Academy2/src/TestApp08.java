//ESTRUCTURAS CONDICIONALES EN JAVA

/**
 * IF-ELSE: es como el anterior solo que después de cerrarse la llave de if,
 * se añade else sin indicarle ninguna condición. Esto sirve para que si la condición
 * del if no es verdadera, ejecute otras instrucciones que estarán dentro de else.
 * Se suele traducir como "Si se cumple esta condición haz esto y sino haz esto".
 * 
 * 
 * 
 * @author monts
 *
 */
public class TestApp08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precio =50;
		
		if (precio>100) {
			System.out.println("El precio es mayor que 100");
		}else {		
			System.out.println("El precio es menor que 100");
			
		}
		

	}

}
