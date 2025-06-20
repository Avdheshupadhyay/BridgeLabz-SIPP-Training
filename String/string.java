
import java.util.*;
public class string {
    public static boolean solve(String a,String b){
        int n=a.length();
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // enter the String 
        System.out.println("enter the first String ");
        String a=sc.nextLine();
       System.out.println("enter the Second String ");
        String b=sc.nextLine();
        //call the userdefined
        boolean UserDefined=solve(a,b);
        // call the builtin
        boolean builtIn=a.equals(b);
        // check the final answer
        System.out.println("the answer is "+ (UserDefined&&builtIn));

    }
}
