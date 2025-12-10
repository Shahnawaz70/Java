
public class Professor extends Person {
	private double salary;
	public Professor(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public void getRoleInfo() {
		System.out.println("Role Professor, Salary " + salary);
	}

}
