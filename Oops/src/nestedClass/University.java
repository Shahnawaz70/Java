package nestedClass;

public class University {
	static class Department {
		String departmentName;
		int nooffaculty;
		
		public Department(String departmentName, int nooffaculty) {
			this.departmentName = departmentName;
			this.nooffaculty = nooffaculty;
		}
		public void displayInfo() {
			System.out.println("Department Name: " + departmentName);
			System.out.println("Number of faculty: " + nooffaculty);
		}
	}
}
