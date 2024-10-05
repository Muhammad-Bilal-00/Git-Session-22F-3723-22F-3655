public class Main {
	public static void main(String[] args) {
		Library myLibrary = new Library();
		myLibrary.addBook("Harry Potter");
		myLibrary.addBook("Lord of the Rings");
		myLibrary.listBooks();
		System.out.println("Reached at end of the library");
	}
}
