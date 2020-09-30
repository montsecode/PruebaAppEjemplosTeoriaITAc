//METODOS STRING


public class TestApp04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena="El que se fue a Sevilla perdió su silla y el que se fue a Torreon, su sillon";
		
			System.out.println(cadena.charAt(0));// devoleverá e);
			System.out.println(cadena.charAt(11));
			System.out.println(cadena.endsWith("n"));
			System.out.println(cadena.startsWith("e"));
			System.out.println(cadena.equals("El que se fue a Sevilla perdió su silla y el que se fue a Torreon, su sillon"));
			byte[] array_bytes=cadena.getBytes();
			System.out.println("Codigo ASCII de cada caracter");
			
			for (int i=0;i<array_bytes.length;i++) {
				System.out.println(array_bytes[i]+" ");// Muestra los códigos
				
			}
	
			System.out.println("");
			System.out.println(cadena.indexOf("fue"));  //localiza posición "la"
			System.out.println(cadena.length());// devuelve longitur: 77
			System.out.println(cadena.replace('a', 'e'));//cambia tolas las a por e
			System.out.println(cadena.toLowerCase());//transforma string a min
	
	}

}
