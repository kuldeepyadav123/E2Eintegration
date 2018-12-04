package javaprogram;

import java.util.Scanner;

public class Reverseinteger 
{
	public static void main(String[] args) 
	{
		int n ;
		int rev= 0;
		 int r;
		 System.out.println("enter the no");
		 Scanner obj = new Scanner(System.in);
		  n=  obj.nextInt();
	
		 
		 while (n>0)
		 {
			r = n%10;
			rev= rev*10+r;
			n= n/10;
			
			}
		
		 
		System.out.println("reverse no is   " + rev);
	}

}
