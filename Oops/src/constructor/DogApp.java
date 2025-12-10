package constructor;

public class DogApp {
	public static void main(String[] args) {
		Dog dog = new Dog("Basanti", "White");
		System.out.println("Dog Name " + dog.getName()+ " Color " + dog.getColor());
	}
}
