//package Class&Object

public class Employee {
    private String name;
   private int id;
   private int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        
        System.out.println("the Employee id  is = "+id);
        System.out.println("the Employee Name  is = "+name);
        System.out.println("the Employee salary is = "+salary);  

    }
    public static void main(String []args){
        Employee employee=new Employee("tim",1,25000);
        employee.display();
    }

}
