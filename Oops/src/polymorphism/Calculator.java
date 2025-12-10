package polymorphism;

public class Calculator {
	public void add(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Sum = " + (a + b + c));
	}
	public void add(double m, double n) {
		System.out.println("Sum = " + (m + n));
	}
}
