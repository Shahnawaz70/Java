package innerClass;

public class Outer {
	int x = 10;

	class Inner {
		int y;

		Inner(int y) {
			this.y = y;
		}
		public void display() {
			System.out.println("X + Y = " + (x+y));
		}
	}

}
