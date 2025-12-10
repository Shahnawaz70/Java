package constructor;

public class RectangleApp {

	public static void main(String[] args) {
		RectangleCopyConstructor rectangle = new RectangleCopyConstructor(40.5,10.5);
		rectangle.displayArea();
		RectangleCopyConstructor rcopy = new RectangleCopyConstructor(rectangle);
		rcopy.displayArea();

	}

}
