package program;

public class sortString 
{
	public static void main(String[] args) 
	{
	
	String s = "KULdeep yadav";
	String low = "";
	String upper = "";
	char ch;
	for (int i=0; i<=s.length()-1;i++)
	{
		ch= s.charAt(i);
		
		 if (ch >= 'A' && ch <= 'Z')
		 { 
           upper = upper +ch; 
         } 
		
		 else
		 {
			 low = low +ch;
		 }
  
	  
	}
	
	System.out.println(upper+low);
	}
	  
	  
	  
	}


