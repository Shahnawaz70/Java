package Inheritance;

public class Programmer extends Employee {

	public Programmer(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
	}
	@Override
	public double calculateBonus() {
		return getSalary() * 0.1;
	}
	@Override
	public String generatePerformanceReport() {
		return "Performance report of " + getName() + " is very good";
	}

}
