
public class ProductApp {
	public static void main(String[] args) {
		Product phone = new Electronics(101, "Smartphone", 30000);
		Product tshirt = new Clothing(102, "Polo T-Shirt", 1000);
		Product oil = new Grocery(103, "Furtune Oil", 166);
		
		phone.displayInfo();
		System.out.println("Discounted Price: " + phone.getDiscountedPrice());
		phone.addToCart(1);
		
		tshirt.displayInfo();
		System.out.println("Discounted Price: " + tshirt.getDiscountedPrice());
		tshirt.addToCart(5);
		
		oil.displayInfo();
		oil.addToCart(3);
	}
}
