package program;

public class convertStringtochararray 
{

	public static void main(String[] args) {
		
		String s = "kuldeep yadav";
		char ch[] = new char[s.length()];
		for (int i =0; i<=s.length()-1; i++)
		{
			System.out.println(ch[i] =s.charAt(i));
			
		}
		
		
		for(char c : ch)
		{
		 	System.out.println( c );
		}
	}
}

 
