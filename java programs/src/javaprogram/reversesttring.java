package javaprogram;

public class reversesttring 
{
	public static void main(String[] args) 
	{
		
		String s = "automation";
		int len= s.length();
	//	String rev = "";
	//	for(int i= len-1;i>=0;i--)
		//{
		//	
			//= rev+s.charAt(i);
			
	//	}
		//System.out.println(rev);
		//
		
		StringBuffer sb = new StringBuffer(s);
		//sb.reverse();
		System.out.println(sb.reverse());
		
	}

}
