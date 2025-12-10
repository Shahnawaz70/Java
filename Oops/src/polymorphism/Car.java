package polymorphism;

public class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car is ready to start");
	}
}
