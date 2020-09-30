

package team.ed.test;


import storage.Database;
import team.ed.objects.Product;


public class Main1 {
	public static void main(String[] args) {
		storage.Database database new Database();
	
		int i;
		Product product = database.getByIndex(i);
		System.out.println(product);
		
		product.setName("Pastuza");
		product.setAmount(10);
		product.setPrice(1000);
		
		Product[] products = database.getAll();
		for (Product v:products) {
			System.out.println(v);
			
		}
		
	}

}
