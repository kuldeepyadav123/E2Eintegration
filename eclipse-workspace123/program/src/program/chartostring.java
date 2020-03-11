package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chartostring 
{
	
public static void main(String[] args) 
{
	
	List<Character> str =  
            Arrays.asList('G', 'e', 'e', 'k', 's'); 
	
      StringBuilder sb = new StringBuilder();
    
      
      for (char ch:str)
     {
   	  sb.append(ch);
     }
String s = sb.toString();
System.out.println(s);

	
}}


