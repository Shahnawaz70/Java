package innerClass;

public class OuterApp {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner add = outer.new Inner(10);
		add.display();
	}
}
