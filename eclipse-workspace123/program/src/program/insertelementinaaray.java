package program;

public class insertelementinaaray
{
	
	public static void main(String[] args) 
	{
		
	int a[] = {1,5,6,8,9};
	
	int no = 6;
	int pos = 3;
	
	for(int i =a.length-1; i>pos-1 ;i--)
	{
		
		a[i]= a[i-1];
		
	}
	a[pos-1]=no;
	for (int i=0; i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	
		
	}

}
