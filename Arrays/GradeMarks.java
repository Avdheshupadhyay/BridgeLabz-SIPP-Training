// import the package
import java.util.*;
public class GradeMarks {
   public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       // take the input for number of students
       System.out.println("enter the number of students :");
       int number=sc.nextInt();
       // Create a 2D array to store the maths physics and chemistry marks of students
       int [][]result=new int[number][3];
       for(int i=0;i<number;i++){
           for(int j=0;j<3;j++){
               if(j==0){
                   System.out.println("enter the Maths Marks of Student "+(i+1)+" =");
               }
               else if(j==1){
                    System.out.println("enter the Physics Marks of Student "+(i+1)+" =");
               }
               else{
                      System.out.println("enter the chemistry Marks of Student "+(i+1)+" =");
               }
               int n=sc.nextInt();
               result[i][j]=n;
           }
       }
       // initilize the array to store  marks , percentage , grade of students
       int []percentage=new int[number];
       char []grade=new char[number];
       for(int i=0;i<number;i++){
           int sum=0;
           for(int j=0;j<3;j++){
               int n=result[i][j];
               sum+=n;
           }
           // check for grade and percentages
           int percent = (int)(((double) sum / 300) * 100);
           percentage[i]=percent;
           if(percent>=80){
               grade[i]='A';
           }
           else if(percent>=70){
               grade[i]='B';
           }
           else if(percent>=60){
               grade[i]='C';
           }
            else if(percent>=50){
               grade[i]='D';
           }
           else if(percent>=40){
               grade[i]='E';
           }
           else{
               grade[i]='R';
           }
           
       }
       for(int i=0;i<number;i++){
           System.out.println((i+1)+"Student Result :");
           for(int j=0;j<3;j++){
               if(j==0){
               System.out.print("Maths Marks = "+result[i][j]+"  ");
               }
               else if(j==1){
               System.out.print("physics Marks = "+result[i][j]+"  ");
               }
               else if(j==2){
               System.out.print("Chemistry Marks = "+result[i][j]+"  ");
               }
           }
           System.out.println();
           System.out.print("percentage is "+ percentage[i]+"  ");
           System.out.println("grade is "+ grade[i]);
       }
       
   }
}
