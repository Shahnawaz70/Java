package Static;

public class InitializerApp {
	public static void main(String[] args) {
		System.out.println("Initial Value before creagting Instance "+ Initializer.initialValue);
		Initializer i = new Initializer();
		System.out.println("Initial Value after creagting Instance "+ i.initialValue);
		
	}
}
