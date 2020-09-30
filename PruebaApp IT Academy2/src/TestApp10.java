//El ejemplo anterior es equivalente al siguiente, esto es lo que se conoce como
/**
 * IF ANIDADOS
 * podemos anidar tantos como queramos
 * @author monts
 *
 */
public class TestApp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio=50;
		
		if (precio>100) {
		}else {
			if(precio>80) {
				System.out.println("El precio es mayorque 80");
			}else {
				System.out.println("El precio es menor que 80");
			}
		
		}
	}

}
