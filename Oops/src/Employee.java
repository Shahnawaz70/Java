
public abstract class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public abstract double calculateBonus();
	
	public void displayDetails() {
		System.out.println("Employee ID: " + id + " Name: "+ name+ " Salary " + getSalary());
	}
}
