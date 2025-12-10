package constructor;

public class RectangleCopyConstructor {
	double length;
	double width;
	public RectangleCopyConstructor(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public RectangleCopyConstructor(RectangleCopyConstructor rectangle) {
		this.length = rectangle.length;
		this.width = rectangle.width;
	}
	void displayArea() {
		System.out.println(length * width);
	}
}
