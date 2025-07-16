import java.util.*;

// Book class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // equals and hashCode to avoid duplicates in HashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equalsIgnoreCase(b.title) && author.equalsIgnoreCase(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

// Node class for Linked List
class BookNode {
    Book book;
    BookNode next;

    BookNode(Book book) {
        this.book = book;
        this.next = null;
    }
}

// Custom singly linked list
class BookLinkedList {
    BookNode head;

    // Add book at end
    public void add(Book book) {
        BookNode newNode = new BookNode(book);
        if (head == null) {
            head = newNode;
            return;
        }
        BookNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove book by title
    public boolean remove(String title) {
        if (head == null) return false;

        if (head.book.title.equalsIgnoreCase(title)) {
            head = head.next;
            return true;
        }

        BookNode current = head;
        while (current.next != null) {
            if (current.next.book.title.equalsIgnoreCase(title)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Print all books
    public void display() {
        BookNode current = head;
        while (current != null) {
            System.out.println("   → " + current.book);
            current = current.next;
        }
    }

    // Check if book exists by title
    public boolean contains(String title) {
        BookNode current = head;
        while (current != null) {
            if (current.book.title.equalsIgnoreCase(title)) return true;
            current = current.next;
        }
        return false;
    }
}

//  Manager class
class BookShelf {
    Map<String, BookLinkedList> genreMap;
    Set<Book> allBooks;

    BookShelf() {
        genreMap = new HashMap<>();
        allBooks = new HashSet<>();
    }

    // Add book to catalog
    public void addBook(String genre, Book book) {
        if (allBooks.contains(book)) {
            System.out.println(" Book already exists: " + book);
            return;
        }

        genreMap.putIfAbsent(genre, new BookLinkedList());
        genreMap.get(genre).add(book);
        allBooks.add(book);
        System.out.println(" Added: " + book + " under genre: " + genre);
    }

    // Borrow (remove) book by genre and title
    public void borrowBook(String genre, String title) {
        BookLinkedList list = genreMap.get(genre);
        if (list == null || !list.contains(title)) {
            System.out.println(" Book not found in genre: " + genre);
            return;
        }

        boolean removed = list.remove(title);
        if (removed) {
            allBooks.removeIf(b -> b.title.equalsIgnoreCase(title));
            System.out.println(" Borrowed: \"" + title + "\" from " + genre);
        }
    }

    // Return book to genre
    public void returnBook(String genre, Book book) {
        if (allBooks.contains(book)) {
            System.out.println(" Book already exists in shelf: " + book);
            return;
        }

        genreMap.putIfAbsent(genre, new BookLinkedList());
        genreMap.get(genre).add(book);
        allBooks.add(book);
        System.out.println(" Returned: " + book + " to genre: " + genre);
    }

    // Display entire library
    public void displayCatalog() {
        if (genreMap.isEmpty()) {
            System.out.println(" Library is empty.");
            return;
        }

        System.out.println(" Library Catalog:");
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            genreMap.get(genre).display();
        }
    }
}

// Test the system
public class LibraryManager {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("The Alchemist", "Paulo Coelho"));
        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
        shelf.addBook("Science", new Book("A Brief History of Time", "Stephen Hawking"));
        shelf.addBook("Fiction", new Book("1984", "George Orwell")); // duplicate

        System.out.println();
        shelf.displayCatalog();

        System.out.println();
        shelf.borrowBook("Fiction", "1984");
        shelf.borrowBook("Science", "The Selfish Gene"); // not found

        System.out.println();
        shelf.returnBook("Fiction", new Book("1984", "George Orwell"));
        shelf.returnBook("Fiction", new Book("The Alchemist", "Paulo Coelho")); // duplicate

        System.out.println();
        shelf.displayCatalog();
    }
}
