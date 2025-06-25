// BookLibrary.java
// Access Modifiers Example
public class BookLibrary {
    protected String title;
    private String author;

    public BookLibrary(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
