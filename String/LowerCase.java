import java.util.*;
public class LowerCase {
    public static String UserDefined(String str){
    String ans="";
    for(int i=0;i<str.length();i++){
        int n=str.charAt(i);
        n+=32;
        ans+= (char)(n);
    }
    return ans;
}
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // for input
        System.out.println("enter the String :");
        String str=sc.nextLine();
        // use builtin method
        String builtIn=str.toLowerCase();
        // call the userdefine method
        String UserDefine=UserDefined(str);
        // check the ouput
        System.out.println("The answer is "+builtIn.equals(UserDefine));



    }
}
