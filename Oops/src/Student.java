
public class Student extends Person {
	private String grade;
	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}
	
	public void getRoleInfo() {
		System.out.println("Role: Student, Grade: " + grade);

	}
}
