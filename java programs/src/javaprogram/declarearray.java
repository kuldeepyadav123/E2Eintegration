package javaprogram;

import java.util.Random;

public class declarearray
{
	public static void main(String[] args) 
	{
		int a[] = {5,4,5,6};
		int position=0;
		
		Random randm = new Random();
		
		for(int i= 0; i<a.length;i++)
		{
			position=randm.nextInt(10);
			System.out.println("random no is "+position);
			
			if (position<a.length)
			System.out.println(a[i]);
		}
		
	}
	

}
