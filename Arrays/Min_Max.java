import java.util.*;
public class Min_Max
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// input the size
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		int []nums=new int[size];
		for(int i=0;i<size;i++){
		    // take input numbers from user
		    System.out.println("Enter the Elements :");
		    nums[i]=sc.nextInt();
		}
		// initialize the Values
		int Largest=Integer.MIN_VALUE,Second_Largest=Largest;
		for(int i=0;i<size;i++){
		    // Apply the condition for Largest
		    if(nums[i]>Largest){
		        Second_Largest=Largest;
		        Largest=nums[i];
		    }
		    // Apply the condition  for Second Largest
		    else if(nums[i]>Second_Largest && nums[i]!=Largest){
		        Second_Largest=nums[i];
		    }
		}
		System.out.println("the Largest element in Array is = "+Largest);
		System.out.println("the Second-Largest element in Array is = "+ Second_Largest);
	}
}
