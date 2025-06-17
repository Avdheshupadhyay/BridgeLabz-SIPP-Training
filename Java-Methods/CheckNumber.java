import java.util.Scanner;
public class CheckNumber {
    public int solve(int number){
        if(number>0){
            return 1;
        }
        // apply the condition
        return number<0?-1:0;
    }
      public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // take input from user
        System.out.println("enter the number :");
        int number=sc.nextInt();
        sc.close();
        // create a object
        CheckNumber checknumber=new CheckNumber();
        // call the method
        System.out.println(checknumber.solve(number));
        
      }
}
