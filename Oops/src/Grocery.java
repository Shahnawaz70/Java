
public class Grocery extends Product {

	public Grocery(int productId, String productname, double price) {
		super(productId, productname, price);
	}

	@Override
	public double getDiscountedPrice() {
		return getPrice(); // No Discount
	}

}
