package program;

import java.util.Scanner;

public class palindromeString {
	public static void main(String[] args)
	{
		String s,rev = "";
		
	
		 System.out.println("enter the String");
		Scanner scan = new Scanner(System.in);
		 s = scan.nextLine();
	
		 for (int i = s.length()-1;i>=0;i--)
		 {
			 rev = rev+s.charAt(i);
		 }
		 
		 if (rev==s)
		 {
		 System.out.println("String is palindrome");
		 }
		 else
		 {
			 System.out.println("string is not palindrome");
		 }
				
		
		
	}

}
