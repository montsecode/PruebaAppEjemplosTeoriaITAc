//ESTRUCTURAS CONDICIONALES EN JAVA

/**
 * IF-ESLEIF: esta estructura es como una mezcla de los anteriores, esto nos permite, que si no se 
 * cumple la condición podamos indicar otra condición para hacerlo aun más especifico. Se suele
 * traducir como "Si se cumple esta condición haz esto y sino se cumple esta condición haz esto otro".
 * 
 * 
 * 
 * 
 * @author monts
 *
 */
public class TestApp09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio=50;
		
		if(precio>100) {
			System.out.println("El precio es mayor que 100");
			
		}else if(precio>80) {
			System.out.println("El precio es mayor que 80");
		}else {
			System.out.println("El precio es menor que 80");
			
		}
			}

}
