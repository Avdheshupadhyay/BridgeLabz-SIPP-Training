import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordManagement {
    private Student head;

    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void addAtPosition(int pos, int rollNumber, String name, int age, String grade) {
        if (pos <= 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            addAtEnd(rollNumber, name, age, grade);
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void displayAll() {
        Student temp = head;
        if (temp == null) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("RollNo\tName\tAge\tGrade");
        while (temp != null) {
            System.out.println(temp.rollNumber + "\t" + temp.name + "\t" + temp.age + "\t" + temp.grade);
            temp = temp.next;
        }
    }

    public boolean updateGrade(int rollNumber, String newGrade) {
        Student temp = searchByRollNumber(rollNumber);
        if (temp != null) {
            temp.grade = newGrade;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Display All");
            System.out.println("7. Update Grade");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Grade: ");
                    String grade = sc.nextLine();
                    if (choice == 1) srm.addAtBeginning(roll, name, age, grade);
                    else if (choice == 2) srm.addAtEnd(roll, name, age, grade);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        srm.addAtPosition(pos, roll, name, age, grade);
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    int delRoll = sc.nextInt();
                    srm.deleteByRollNumber(delRoll);
                    break;
                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    Student found = srm.searchByRollNumber(searchRoll);
                    if (found != null) {
                        System.out.println("Found: " + found.rollNumber + ", " + found.name + ", " + found.age + ", " + found.grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    srm.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Roll Number to update grade: ");
                    int upRoll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new grade: ");
                    String newGrade = sc.nextLine();
                    if (srm.updateGrade(upRoll, newGrade)) {
                        System.out.println("Grade updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}
