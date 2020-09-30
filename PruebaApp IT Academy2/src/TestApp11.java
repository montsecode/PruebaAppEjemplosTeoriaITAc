//ESTRUCTURAS CONDICIONALES EN JAVA

/**
 * SWITCH: esta estructura condicional de selección múltiple,
 * le damos un valor( puede ser una variable), y una lista de casos
 * y si cumple alguno de los casos ejecuta las instrucciones
 * asociadas a ella, en caso de que ninguna sea podemos indicarle que hace por defecto, normalemnte se usa
 * para indicar de un error con un mensaje
 * 
 * 
 * 
 * @author monts
 *
 */
public class TestApp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia ="Lunes";
		
		switch (dia) {
		case"Lunes":
			System.out.println("Hoy es "+dia);
			break;
		case"Martes":
			System.out.println("Hoy es "+dia);
			break;
		case"Miércoles":
			System.out.println("Hoy es "+dia);
			break;
		case"Jueves":
			System.out.println("Hoy es "+dia);
			break;
		case"Viernes":
			System.out.println("Hoy es "+dia);
			break;
		case"Sábado":
			System.out.println("Hoy es "+dia	);
			break;
		case"Domingo":
			System.out.println("Hoy es "+dia);
			break;
		default:
			System.out.println("No has instroducido un dia correcto");
			
		
		}
	}

}
