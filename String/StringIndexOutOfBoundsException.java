import java.util.Scanner;

public class StringIndexOutOfBoundsException {
     static void checkException(String s){
    int n=s.length();
    try{
        System.out.println(s.charAt(n));
    }
    catch(Exception e){
        System.out.println("the error is " + e);
    }
 }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the text :");
        String s=sc.nextLine();
        // call the method
        checkException(s);

    }
}
