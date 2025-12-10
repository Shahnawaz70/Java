package constructor;

public class CatApp {
	public static void main(String[] args) {
		Cat cat = new Cat(null, 0);
		System.out.println("Name " + cat.getName());
		System.out.println("Age " + cat.getAge());
	}
}
