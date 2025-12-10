package Inheritance;

public class Developer extends Employee {

	public Developer(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
	}
	public double calculateBonus() {
		return getSalary() * 0.10;
	}
	@Override
	public String generatePerformanceReport() {
		
		return "Performance report of" + getName() + " is Good.";
	}
}
