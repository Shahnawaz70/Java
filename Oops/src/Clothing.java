
public class Clothing extends Product {

	public Clothing(int productId, String productname, double price) {
		super(productId, productname, price);
	}

	@Override
	public double getDiscountedPrice() {
		return getPrice() * 0.8; // 20% Discount;
	}

}
