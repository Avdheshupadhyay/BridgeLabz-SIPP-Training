// LibraryBookChild.java
// Demonstrates access to protected member
public class LibraryBookChild extends BookLibrary {
    public LibraryBookChild(String title, String author) {
        super(title, author);
    }
    public void displayTitle() {
        System.out.println("Title: " + title);
    }
}
