package program;

public class insertstringusingsubstringmethod
{
	public static void main(String[] args) 
	{
		
		String s = "geekgeek";
		int index = 3;
		String insert = "for";
		
		String s1 =s.substring(0,index+1)+insert+s.substring(0,4);
		System.out.println(s1);
		
	}
	

}