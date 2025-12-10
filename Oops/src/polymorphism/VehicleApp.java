package polymorphism;

public class VehicleApp {
	public static void main(String[] args) {
		RunVehicle.acceptVehicle(new Car());
		RunVehicle.acceptVehicle(new Bike());
	}
}
