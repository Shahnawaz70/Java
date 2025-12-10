package Inheritance;

public class Company {
	public static void main(String[] args) {
		Employee employee = new Employee("Rahat", "Bihar", 41000.00, "Frontend Developer");
		employee.calculateBonus();
		employee.generatePerformanceReport();
		Manager manager = new Manager("Tarana", "Dangibasti", 50000, "Sr. Manager");
		manager.calculateBonus();
		manager.generatePerformanceReport();
		Developer developer = new Developer("Guddu", "Kolkata", 47000.50, "Backend Developer");
		developer.calculateBonus();
		developer.generatePerformanceReport();
		Programmer programmer = new Programmer("Sani", "UP", 67000, "Python Programmer");
		programmer.calculateBonus();
		programmer.generatePerformanceReport();
	}
}
