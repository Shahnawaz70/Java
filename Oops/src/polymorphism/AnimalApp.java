package polymorphism;

public class AnimalApp {
	public static void main(String[] args) {
		Animals.accepSound(new Animal());
		Animals.accepSound(new Dog());
		Animals.accepSound(new Cat());
	}
}
