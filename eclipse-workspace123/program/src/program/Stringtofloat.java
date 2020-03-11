package program;

public class Stringtofloat 
{
	public static void main(String[] args)
	{
		float a = 1;
		String s = "kuld" + a;
		
		System.out.println(s);
		//
		
		String s2=s.valueOf(s);
		System.out.println(s2);
	}

}
