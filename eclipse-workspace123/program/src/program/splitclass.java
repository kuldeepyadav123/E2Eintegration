package program;

class Splitclass{
	  public static void main(String []args){
	   String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
	   String s2 ;
	    String[] arrSplit = strMain.split(", ");
	    for (int i=0; i < arrSplit.length; i++)
	    {
	      //System.out.println(arrSplit[i]);
	    }
	    
	    
	    for (int i =arrSplit.length-1; i>=0; i--)
	    {
	    	s2 = arrSplit[i] + " ";
	    	  System.out.print(s2);	
	  }
	  
	    }
	}