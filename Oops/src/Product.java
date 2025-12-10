
public abstract class Product {
	private int productId;
	private String productname;
	private double price;
		
	public Product(int productId, String productname, double price) {
		this.productId = productId;
		this.productname = productname;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	
	public String getProductname() {
		return productname;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract double getDiscountedPrice();
	
	public void displayInfo() {
		System.out.println("Product ID: " + productId + " Product Name:" + productname + " Product Price: " + price);
	}
	public void addToCart() {
		System.out.println(productname + " addedd to cart");
	}
	public void addToCart(int quantity) {
		System.out.println(quantity + " x " + productname + " added to cart");
	}
}
