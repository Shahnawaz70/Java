package innerClass;

public class Calculator {
	void calculate(int a, int b) {
		class Adder {
			int add() {
				return a+b;
			}
		}
		Adder adder = new Adder();
		System.out.println("Sum = " + adder.add());
	}
	
}
