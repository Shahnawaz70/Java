package polymorphism;

public class Printer {
	public String print(String name) {
		return name;
	}
	public int print(int a) {
		return a;
	}
	public void print(String a, int b) {
		System.out.println("String A: " + a);
		System.out.println("Integre B: " + b);
	}
}
