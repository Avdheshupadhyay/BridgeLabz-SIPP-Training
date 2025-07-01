// Restaurant Management System with Hybrid Inheritance (using interface)
interface Worker {
    void performDuties();
}
class PersonRM {
    protected String name;
    protected int id;
    public PersonRM(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Chef extends PersonRM implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking meals.");
    }
}
class Waiter extends PersonRM implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}
public class RestaurantManagementHybrid {
    public static void main(String[] args) {
        Worker[] workers = {new Chef("Gordon", 1), new Waiter("Anna", 2)};
        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
