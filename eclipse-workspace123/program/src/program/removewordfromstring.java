package program;

public class removewordfromstring 

{
	public static void main(String[] args) 
	{
		
	String s= "geeks for geeks";
	String s2 = "for";
	String s3 =  "";
	
	if (s.contains(s2))
	{
		s3 = s2 + "";
		s = s.replaceAll(s2, "");
		
		s3 = "" + s2;
		
	s = s.replaceAll(s2, "");
	}
		
	System.out.println(s);
	
	
	}

}
