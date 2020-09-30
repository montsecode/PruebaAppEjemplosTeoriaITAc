//ESTRUCTURAS DE REPETICIÓN EN JAVA

/**
 * 
 * DO
 * 
 * do{
 * 	instrucciones
 * }while(condicion);
 * 
 * 
 * 
 * @author monts
 *
 */

import javax.swing.JOptionPane;
public class TestApp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			String texto=JOptionPane.showInputDialog("Introduce un numero entero");
			num=Integer.parseInt(texto);
		}while(num>=10 || num<0);
		System.out.println("El numero introducido es "+num);
		
		}
		
		
	}


