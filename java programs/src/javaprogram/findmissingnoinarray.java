package javaprogram;

public class findmissingnoinarray 
{
	public static void main(String[] args) 
	{
		int sum=0 ; 
		int sum1 =0;
	int a[] ={1,2,4,5};
	
	for (int i=0; i<a.length;i++)
	{
		sum = sum + a[i];
	}
		
	
		for(int j=1;j<=5;j++)
			
		{
			sum1 = sum1 +j;
		 
		}
	
			
		System.out.println(sum1-sum);
	}

}
