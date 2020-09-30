//AMBITO DE UNA VARIABLE

/**
 * Existen varios ripos:
 * 
 * *A nivel global de clase: cuando declaramos uan variable al inicio
 * de la clase( antes del mail), esta variable se podrá leer y modificar en cualquier parte del programa.
 * 
 * 
 * Variable local a nivel de método: una variable se declara dentro de un método y cuando este finaliza, la variable deja de existir
 * 
 * Variable a nivel de bloque de código: cuando creamos uan variabl dentro de un bloque
 * de código( como dentro de un if) este solo existirá dentre de ese blque.
 * 
 * @author monts
 *
 */
public class TestApp01 {
	
	static int variableGlobal=10;

	public static void metodoPrueba() {
		// TODO Auto-generated method stub

		int variableMetodo=40;
		for(int i=0;i<10;i++) {
			System.out.println("La variable i vale "+i);// aqui ya existe la variable i
		}
		System.out.println("La variable i vale "+i); //aqui ya no existe i
	}

	public static void main(String[] args) {

		System.out.println("La variable local vale "+variableMetodo);//aqui ya no existe las variables metodo
		
		int variableLocal1=20;
		if(variableGlobal==10) {
			int variableLocal2=30;
			System.out.println("La variable local 1 vale" + variableLocal1);
			
		}
	System.out.println("La variable local 2 vale "+variableLocal2);
	System.out.println("La variable local Global vale " +variableGlobal);
	metodoPrueba();
	
	}
	
}
