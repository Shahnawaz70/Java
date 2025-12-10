package abstraction;

public class Car extends Vehicle {
	
	public Car(String name, double speed) {
		super(name, speed);
	}
	@Override
	void move() {
		System.out.println(getName()+ " Car is driving on the road at " + getSpeed()+ " km/h");

	}	
}
