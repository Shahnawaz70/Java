package Static;

public class Count {
	static int count = 0;
	public Count() {
		count++;
	}
	public static int getCount() {
		return count;
	}
}
