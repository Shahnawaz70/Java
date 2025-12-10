package abstraction;

public class Bike extends Vehicle {

	public Bike(String name, double speed) {
		super(name, speed);
	}

	@Override
	void move() {
		System.out.println(getName()+ " Bike is driving on the road at " + getSpeed()+ " km/h");

	}

}
