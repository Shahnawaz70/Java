
public class Electronics extends Product {
	
	public Electronics(int productId, String productname, double price) {
		super(productId, productname, price);
	}

	@Override
	public double getDiscountedPrice() {
		return getPrice() * 0.9; // 10% Discount

	}
}
