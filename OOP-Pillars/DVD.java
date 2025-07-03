public class DVD extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            this.borrower = borrower;
            reserved = true;
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
