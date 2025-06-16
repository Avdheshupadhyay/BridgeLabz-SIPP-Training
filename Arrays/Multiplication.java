import java.util.*;
public class Multiplication {
    public static void main(String...args){
        // enter the nummber of table
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        // enter the range of table
        int range=sc.nextInt();
        int []result=new int[range+1];
        // calculate the multiplication table
        for(int i=1;i<=range;i++){
            result[i]=number*i;
        }
        // print the multiplication table
        for(int i=1;i<=range;i++){
            System.out.println(number+" * "+i+" = "+result[i]);
        }
    }
}