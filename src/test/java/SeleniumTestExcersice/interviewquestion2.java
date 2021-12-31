package SeleniumTestExcersice;

public class interviewquestion2 {
	
	/*public static void main(String[] args) {
		//Find max number in array
		int arr[]= {6,8,9,3,2};
		int size= arr.length;
		int temp;
		for (int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i]	;
				arr[i]=arr[j];
				arr[j]=temp;
					
				}
				
			}
			
			
			
		}
			
		System.out.println("the max number in the array is: " +arr[size-1]);
	}*/
	
	
	
	/*public static void main(String[] args) {
	//sort the number in array
	int arr[]= {6,8,9,3,2,9};
	int size= arr.length;
	int temp;
	for (int i=0;i<size;i++)
	{
		for (int j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
			temp=arr[i]	;
			arr[i]=arr[j];
			arr[j]=temp;
				
			}
			
		}
		
		
		
	}
	
	
	//print the sorted array number
	System.out.println("the sorted number in the array is: ");
	for (int i=0;i<size;i++)
	{	
	
	System.out.println( arr[i]);
	}
}*/
	
	
	
	
	public static void main(String[] args) {
	//sort the number in array
	int arr[]= {6,8,7,3,2,9,4};
	int size= arr.length;
	int temp;
	//String a="abcde";

	for (int i=0;i<size/2;i++)
	
	{
			temp=arr[i]	;
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
				
				
		}
		
	//print the sorted array number
	System.out.println("the reverasble numbers in the array are: ");
	for (int i=0;i<size;i++)
	{	
	
	System.out.println( arr[i]);
	}
}
	
	

	
/*	public static void main(String[] args) {
		//Find duplicate number in array
		int arr[]= {6,8,9,3,2,6,2};
		int size= arr.length;
		//int temp;
		for (int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("the duplicate number in the arrays are: " +arr[i]);
					
				}
				
			}
			
			
			
		}
			
	}*/
	
	
	
/*	public static void main(String[] args) {
		//Find non repeated number in array
		int arr[]= {6,8,9,3,2,6,2};
		int size= arr.length;
		//int temp;
		for (int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j] )
				{
				  break;
				}
				else
				{
					System.out.println("the non repeated number in the arrays are: " +arr[i]);
				}
				
				
			}
			
			
			
		}
		
		//System.out.println("the non repeated number in the arrays are: " +arr[i]);
	}
	*/
}
