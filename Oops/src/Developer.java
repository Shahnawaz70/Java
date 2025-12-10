
public class Developer extends Employee {

	public Developer(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double calculateBonus() {
		return getSalary() * 1.20; // 20% Bonus
	}

}
