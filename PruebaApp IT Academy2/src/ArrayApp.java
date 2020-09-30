
public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]=rellenarArrayDesde(5);
		imprimirArray(num);
		
	}
	
	public static void imprimirArray (int lista []) {
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
	public static int[] rellenarArrayDesde(int a) {
		int num[]=new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=a;
			a++;
			
		}
		return num;
	}
	
}
