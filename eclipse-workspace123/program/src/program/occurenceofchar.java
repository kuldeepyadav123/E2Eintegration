package program;

public class occurenceofchar
{
public static void main(String[] args) 
{  
	int count[] = new int[256];
	String s = " geeks for geeks";
	for (int i=0;i<s.length();i++)
	{
		 count[s.charAt(i)]++;
		 
		 
	}

	char ch[] = new char[s.length()];
	
	for (int i=0;i<s.length();i++)
	{
		ch[i] = s.charAt(i);
		int find = 0;
		for (int j=0; j<=i; j++)
		{
		
			if(s.charAt(i)==ch[j])
			  find++;  
			
		}
		if (find==1)
		{
			System.out.println("number of occurence    " +   s.charAt(i)   + "   is   "    +count[s.charAt(i)]);
			
		}
				
			
			
			
		}
		
		
		
		
		
		
	}
	
}



