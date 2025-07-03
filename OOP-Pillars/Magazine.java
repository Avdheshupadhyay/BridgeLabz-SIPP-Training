public class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            this.borrower = borrower;
            reserved = true;
            System.out.println("Magazine reserved by " + borrower);
        } else {
            System.out.println("Magazine already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
