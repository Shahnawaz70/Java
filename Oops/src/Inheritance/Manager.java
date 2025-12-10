package Inheritance;

public class Manager extends Employee {
	
	public Manager(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		
	}
	@Override
	public double calculateBonus() {
		
		return getSalary()* 0.15;
	}
	@Override
	public String generatePerformanceReport() {
		return "Performance report for manager" + getName() + " is Excillent";
	}

}
