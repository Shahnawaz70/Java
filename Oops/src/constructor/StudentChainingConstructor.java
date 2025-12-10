package constructor;

public class StudentChainingConstructor {
	int studnetid;
	String studentName;
	String grade;
	public StudentChainingConstructor() {
		this(100,"Ahmad","B");
	}
	public StudentChainingConstructor(int studnetid, String studentName, String grade) {
		super();
		this.studnetid = studnetid;
		this.studentName = studentName;
		this.grade = grade;
	}
	
}
