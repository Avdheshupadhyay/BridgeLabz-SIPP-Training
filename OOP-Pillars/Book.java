public class Book extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 21; // 21 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            this.borrower = borrower;
            reserved = true;
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
