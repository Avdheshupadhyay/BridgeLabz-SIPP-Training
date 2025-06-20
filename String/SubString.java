
import java.util.*;
public class SubString {
    public static String solve(String str,int start,int last){
          String ans="";
      for(int i=start;i<last;i++){
          ans+=str.charAt(i);
         }
             return ans;
    } 
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // take input for string and index
        System.out.println("enter the String :");
        String str=sc.nextLine();
         System.out.println("enter the Starting index :");
         int start=sc.nextInt();
          System.out.println("enter the last index :");
        int last=sc.nextInt();
        // call the bulitin method
        String builtIn=str.substring(start,last);
        // call the userdefined
        String UserDefine=solve(str,start,last);
        // check the final answer
        System.out.println("the Builtin and Userdefined substring is = "+builtIn + "   the answer is "+ (builtIn.equals(UserDefine)));
    }
}
