
public class Application {

	// global variables 
	
	// access modifier > data type > property name > semicolon 
	public String name; 
	
		
	public static void main(String[] args) {
		// a is een object van Product, en dus ook een variable 
		Product a = new Product();
		a.increasePrice(500);
		a.productSoldOut();
		a.print();
			
		// b is een object van Product 
		Product b = new Product();
		b.setName("Lenovo");
		b.setPrice(1500);
		System.out.println(b.isCheap());
		b.print();	
	}
}
