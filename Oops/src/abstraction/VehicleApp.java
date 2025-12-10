package abstraction;

public class VehicleApp {
	public static void main(String[] args) {
		Vehicles.acceptRef(new Car("BMW", 25.5));
		Vehicles.acceptRef(new Bike("Suzuki", 23));
		Vehicles.acceptRef(new Truck("Mahindra", 7.5));
	}
}
