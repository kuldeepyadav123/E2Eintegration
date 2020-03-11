package program;

public class reverseString 
{
	public static void main(String[] args) {
		
	
	
	String str = " my name is kuldeep";
		String str1 = " ";
		String a[] = str.split(" ");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
			
		}
		for (int i =a.length-1;i>=0;i--)
		{
			str1 = str1 + a[i]+ " " ;
			
		}
		System.out.print( str1 );
}
}