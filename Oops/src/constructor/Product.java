package constructor;

public class Product {
	String name;
	int price;
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("Constructor with name and price called");
	}
	public Product(String name) {
		this(name, 0);
		System.out.println("Constructor with name only called");
	}
	public Product() {
		this("Unknown",0);
		System.out.println("No-argument constructor called");
	}
	public void display() {
		System.out.println("Product name: " + name + " Price: "+ price);
	}
	
	
}	
