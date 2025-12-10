package Static;

public class CountApp {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		Count c5 = new Count();
		System.out.println("Total object created " + Count.getCount() + " times");
		
		
	}
}
