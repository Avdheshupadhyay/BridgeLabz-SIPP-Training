import java.util.*;
public class MaxDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// input the number
		System.out.println("Enter the number = ");
		int number=sc.nextInt();
		int temp=number;
		int size=(""+number).length();
		int []nums=new int[size];
		int k=0;
		// store digits into Array
	    while(temp>0){
	        int r=temp%10;
	        nums[k]=r;
	        temp/=10;
	        k++;
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

