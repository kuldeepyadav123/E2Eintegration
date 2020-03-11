package program;

public class whitespacescheck 

{
	public static void main(String[] args) {
		
	
	String s1 = "      ";
	   
	if (s1.trim().isEmpty())
	{
		System.out.println("string is empty");
	}
	else
	{
		System.out.println("String is not empty");
	}
}
}