package javaprogram;



public class find_repeating_no_in_array
{
	
	public void repeatingno(int arr[] , int size)
	{
	  int i , j;
	  
	  System.out.println("the repeating no is : ");
	  
	  for(i=0; i<=size; i++)
		  
	  {
		  for(j=i+1 ;j<size ; j++)
		  {
			 
			  if (arr[i]==arr[j])
			  
				  System.out.println(arr[i]+  "");
				  
			  
		  }
		  
	  }

		
	}
	
public static void main(String[] args)
{
	
	find_repeating_no_in_array obj = new  find_repeating_no_in_array ();
	int arr[] = {1,2,3,3,4,4,5};
	int arr_size = arr.length;
	obj.repeatingno(arr, arr_size);
	

}

}
