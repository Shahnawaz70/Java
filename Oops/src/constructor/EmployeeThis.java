package constructor;

public class EmployeeThis {
	String name;
	int age;
	public EmployeeThis(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Constructor with name and age");
	}
	public EmployeeThis(String name) {
		this(name,25); // Constructor 3 calling
		System.out.println("Constructor with name");
	}
	public EmployeeThis() {
		this("Alam"); // Constructing 2 calling 
		System.out.println("Nor argument, No parameter");
	}
	
	void display() {
		System.out.println("Employee name: " + name + ", Age: " + age);
	}
}
