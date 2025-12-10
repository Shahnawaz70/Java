package Static;

public class Initializer {
	static int initialValue;
	static {
		initialValue = 1000;
		System.out.println("Static block: initialValue initialized to " + initialValue);
	}
}
