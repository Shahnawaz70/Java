package polymorphism;

public class Addition {
	public static void calculation(Calculator c) {
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.5, 10.5);
	}
}
