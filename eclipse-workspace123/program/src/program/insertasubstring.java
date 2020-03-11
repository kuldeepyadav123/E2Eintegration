package program;

public class insertasubstring 
{
	public static void main(String[] args) 
	{
     String s = "Geeksgeeks";
     String insert = "for";
     String newstring = new String();
     int index = 4;
     for(int i=0;i<=s.length()-1;i++)
     {
    	 newstring = newstring + s.charAt(i);
    	 
    	 if (i==4)
    	 {
    		newstring = newstring+ insert;
    				 
    		 
    		 
    	 }
    	 
     }
     
     System.out.println(newstring);
     
		
	}

}
