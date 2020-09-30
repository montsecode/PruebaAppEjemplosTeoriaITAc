//PASAR DE STRING A DISTINTOS TIPOS DE DATOS
/**
 * Para pasar de String a un valor numérico, usamos el método PARSE
 * de cada clase de variable primitiva. Vamos a ver un ejemplo:
 * 
 * 
 * 
 * 
 * @author monts
 *
 */
public class TestApp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numString="1234";
		System.out.println("String: "+numString);
		
		long numLong=Long.parseLong(numString);
		System.out.println("long: "+numLong);
	
		int numInt=Integer.parseInt(numString);
		System.out.println("int: "+numInt);
		
		short numShort=Short.parseShort(numString);
		System.out.println("short: "+numShort);
		
		byte numByte=Byte.parseByte(numString);
		System.out.println("byte: "+numByte);
		
		double numDouble=Double.parseDouble(numString);
		System.out.println("double: "+numDouble);
		
		float numFloat=Float.parseFloat(numString);
		System.out.println("Float: "+numFloat);
		
	}

}
