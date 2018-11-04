package javaprogram;

public class regexp 
{
	public static void main(String[] args) {
		
	
	String s = "Kuldeep@#$%^^&";
	
	//reg exp = [^a-z0-9]
	s= s.replaceAll("[^a-zA-Z0-9]", " ");
	System.out.println(s);

	}
}
