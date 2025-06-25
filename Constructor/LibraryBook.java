// LibraryBook.java
// Class with title, author, price, availability; borrow method
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed!");
            return true;
        } else {
            System.out.println("Book not available.");
            return false;
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}
