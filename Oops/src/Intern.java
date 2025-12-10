
public class Intern extends Employee {

	public Intern(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double calculateBonus() {
		return getSalary();  // No Bonus
	}

}
