package constructor;

public class StudentApp {
	public static void main(String[] args) {
		StudentChainingConstructor s1 = new StudentChainingConstructor();
		StudentChainingConstructor s2 = new StudentChainingConstructor(101, "Rahat", "A");
		
		System.out.println("Student ID = "+s1.studnetid+ " Student Name: " + s1.studentName + " Grade: " + s1.grade);
		System.out.println("Student ID = "+s2.studnetid+ " Student Name: " + s2.studentName + " Grade: " + s2.grade);
	}
}
