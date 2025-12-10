package innerClass;

public class GreetingApp {
	public static void main(String[] args) {
		Greeting g = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("Hello");
			}

		};
		g.sayHello();
	}
}
