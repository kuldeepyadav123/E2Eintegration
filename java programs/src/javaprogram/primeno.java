package javaprogram;

import java.util.Scanner;

public class primeno 
{
	public static void main(String[] args) 
	{
		int i,n;
		int temp=0;
		System.out.println("enter the no");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();

	for (i=2;i<=n-1;i++)
	{
		if (n%i==0)
		{
			
	  temp = temp+1;
	}}
		
	
	if (temp>0)
	System.out.println("no is not prime");
	
	else
		
	{
		System.out.println("no is prime");
	}
		
		
	
	
	


		

	
	}

}
