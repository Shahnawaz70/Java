package abstraction;

public abstract class Vehicle {
	private String name;
	private double speed;
	
	
	public Vehicle(String name, double speed) {
		this.name = name;
		this.speed = speed;
	}


	public String getName() {
		return name;
	}
	public double getSpeed() {
		return speed;
	}

	abstract void move();
	
	public void displayInfo() {
		System.out.println("Vehicle Name " + name+", Speed" + speed + "km/h");
	}
	public void displayInfo(boolean showSpeed) {
		System.out.println("Vehicle: " + name);
		if(showSpeed)
			System.out.println("Speed: " + speed + " km/h");
	}
}
