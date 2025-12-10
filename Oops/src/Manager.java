
public class Manager extends Employee {
	
	public Manager(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double calculateBonus() {
		return getSalary() * 1.30; // 30% Bonus
		
	}

}
