package nestedClass;

public class Computer {
	
	class Processor {
		String brand;
		double speed;
		
		void displayDetails() {
			System.out.println("Processor brand: " + brand);
			System.out.println("Processor speed: " + speed +"GHz");
		}		
	}

	public void showProcessDetails() {
		Processor processor = new Processor();
		processor.brand = "Intel";
		processor.speed = 3.5;
		processor.displayDetails();
		
	}
}
