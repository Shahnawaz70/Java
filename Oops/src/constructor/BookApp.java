package constructor;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book("Java Programming", "James Goslin");
		Book b2 = new Book("Programmin in C", "Dennis Ritchi", 500);
		System.out.println("Book title: " + b1.getTitle() + " Author Name: " + b1.getAuthor());
		System.out.println("Book title: " + b2.getTitle() + " Author Name: " + b2.getAuthor());
	}
}
