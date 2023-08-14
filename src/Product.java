//Blauwdruk
public class Product {
	private String name;
	private boolean soldOut;
	private int price;
	
	
	public void increasePrice(int raise) {
		//prijs verhogen 
		this.price = this.price + raise;
	}
	
	public void productSoldOut() {
		soldOut = true;
	}
	
	public void print() {
		System.out.println("Het product naam is: "+name);
		System.out.println("Is het product uitverkocht?: " + soldOut);
		System.out.println("De prijs is: " + price);
	}
	
	public void printPrice() {
		System.out.println(price);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isCheap() {
		return this.price<20;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	//constructor met default values
	public Product() {
		this.name = "Default name";
		this.price = 120;
		this.soldOut = false;
	}
	
	//constructor 2 met custom values
	public Product(String name, int price, boolean soldOut) {
		this.name = name;
		this.price = price;
		this.soldOut = soldOut;
	}
	
}





