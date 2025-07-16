// Node class representing a page in browser history
class HistoryNode 
{
    String url;
    HistoryNode prev, next;

    public HistoryNode(String url)
    {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

// Abstract base class for navigable history (Abstraction + Inheritance)
abstract class NavigableHistory 
{
    public abstract void visit(String url);
    public abstract void back();
    public abstract void forward();
    public abstract void currentPage();
}

// Concrete class implementing browser history navigation (Encapsulation + Polymorphism)
class BrowserHistory extends NavigableHistory 
{
    private HistoryNode current;

    public BrowserHistory(String homepage)
    {
        this.current = new HistoryNode(homepage);
    }

    // Visit a new page
    public void visit(String url)
    {
        HistoryNode newNode = new HistoryNode(url);
        current.next = null; // Clear forward history
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        System.out.println("Visited: " + url);
    }

    // Move back
    public void back()
    {
        if (current.prev != null) 
	{
            current = current.prev;
            System.out.println("Moved back to: " + current.url);
        } 
	else 
	{
            System.out.println("No previous page.");
        }
    }

    // Move forward
    public void forward()
    {
        if (current.next != null) 
	{
            current = current.next;
            System.out.println("Moved forward to: " + current.url);
        } 
	else 
	{
            System.out.println("No next page.");
        }
    }

    // Display current page
    public void currentPage()
    {
        System.out.println("Current page: " + current.url);
    }
}
public class HistoryNavigation
{
    public static void main(String... args)
    {
        BrowserHistory browser = new BrowserHistory("home.com");

        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");

        browser.back();         
        browser.currentPage();   

        browser.back();        
        browser.currentPage();  

        browser.forward();       
        browser.currentPage();   

        browser.visit("linkedin.com"); 
        browser.forward();             
        browser.currentPage();       
    }
}

