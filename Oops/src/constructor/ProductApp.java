package constructor;

public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 450000);
		Product p2 = new Product("Mouse");
		Product p3 = new Product();
		
		p1.display();
		p2.display();
		p3.display();
		
	}
}
