
public class CompanyFlexible {
	public static void accept(Employee ref) {
		ref.calculateBonus();
		
		ref.displayDetails();
		System.out.println("Bonus Added salary: " + ref.calculateBonus());
	}
}
