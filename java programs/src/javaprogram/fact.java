package javaprogram;

import java.util.Scanner;

public class fact
{
	public static void main(String[] args)
	{
		int i,n,fact=1;
		 System.out.println("enter the no");
		 Scanner obj = new Scanner(System.in);
		  n=  obj.nextInt();
		  for (i=1;i<=n;i++)
		  {
			 fact= fact*i; 
			  
		  }
		  System.out.println(fact);
		 
		
	}

}
