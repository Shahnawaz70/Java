package abstraction;

public class Vehicles {
	public static void acceptRef(Vehicle ref) {
		ref.displayInfo();
		ref.displayInfo(true);
		ref.move();
		System.out.println();
	}
}
