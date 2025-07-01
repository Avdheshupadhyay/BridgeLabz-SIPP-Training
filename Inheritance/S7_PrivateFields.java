// S7. Minimize Public Fields in Superclasses
class PersonPF {
    private String name;
    public PersonPF(String name) { this.name = name; }
    public String getName() { return name; }
}
public class S7_PrivateFields {
    public static void main(String[] args) {
        PersonPF p = new PersonPF("Alice");
        System.out.println(p.getName());
    }
}
