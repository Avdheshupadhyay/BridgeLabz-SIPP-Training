// S10. Use Interfaces for Multiple Inheritance
interface Printer { void print(); }
interface Scanner { void scan(); }
class MultiFunctionDevice implements Printer, Scanner {
    public void print() { System.out.println("Printing"); }
    public void scan() { System.out.println("Scanning"); }
}
public class S10_InterfaceMultipleInheritance {
    public static void main(String[] args) {
        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.print();
        mfd.scan();
    }
}
