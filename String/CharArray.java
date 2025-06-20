import java.util.*;

public class CharArray {
    public static char[] solve(String str){
        int n=str.length();
        char []c=new char[n];
        for(int i=0;i<n;i++){
            c[i]=str.charAt(i);
        }
        return c;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // take input string from user
        System.out.println("enter the String ");
        String str=sc.nextLine();
        // call the user defined method
        char []UserDefined=solve(str);
        // call the builtin method
        char []builtIn=str.toCharArray();
        System.out.println("the answer is "+ (Arrays.equals(UserDefined,builtIn)));

        
    }
}
