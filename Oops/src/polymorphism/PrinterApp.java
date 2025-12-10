package polymorphism;

public class PrinterApp {
	public static void main(String[] args) {
		Printer p = new Printer();
		System.out.println(p.print("Md Shahnawaz Alam"));
		System.out.println(p.print(500));
		p.print("Ahamd", 27);
	}
}
