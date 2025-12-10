
public class PerosnApp {

	public static void main(String[] args) {
		Person std = new Student("Sumaiya", 25, "A");
		Person p = new Professor("Punith Pathak", 35, 150000);
		
		std.getDeatils();
		std.getRoleInfo();
		p.getDeatils();
		p.getRoleInfo();

	}

}
