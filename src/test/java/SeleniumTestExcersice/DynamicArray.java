package SeleniumTestExcersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
	
	public int biggest_num(ArrayList<Integer> a, int l) 
	{
		System.out.println("Find the maximum element in the array");
		int max=0;
		for(int i=0;i<l;i++) 
		{
			if ((Integer) a.get(i)>max) 
			{
				max=(Integer) a.get(i);
			}//End of if
		}//End of for
		
		return max;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array= new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Press 'y' to add a number to the array");
		
		while(true)
		{
		char c=input.next().charAt(0);
		if(c=='y')
		{
			
		System.out.println("Enter the Number");	
		int i=input.nextInt();
		array.add(i);
		System.out.println("Press 'y' to continue:");
		}//End of if
	    else 
	    {
	       break;
	    }//End of else
		
	}//End of while
		
	int len=array.size();
	System.out.println("The array is:" +array+ "and its length is:" + len);
	DynamicArray m = new DynamicArray(); //Create an object for the class and call the function from the main method.
	System.out.println("The largest number of  the array is:"+ m.biggest_num(array,len));
		  }
	
}


	

