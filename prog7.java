//7. program to enter a string and print the name in shorter manner ex. Ram Chadra Dash output - R.C.Dash
package chap3;

import java.util.Scanner;
public class prog7 
{

	public static void printInitials (String str) 
	{
		int len = str.length(); 
		str = str.trim(); 
		 String t = ""; 
	        for (int i = 0; i < len; i++)
	        {
	        	char ch = str.charAt(i); 
	        	  
	            if (ch != ' ')
	            {
	            	t = t + ch; 
	            }
	            else 
	            {
	            	System.out.print(Character.toUpperCase(t.charAt(0)) 
                            + "."); 
           t = ""; 
	            }
	        }
	        String temp = ""; 
	        for (int j = 0; j < t.length(); j++)
	        {
	        	 if (j == 0) 
	                 temp = temp + Character.toUpperCase(t.charAt(0)); 
	        	 else
	                 temp = temp + Character.toLowerCase(t.charAt(j)); 
	        }
	        System.out.println(temp); 
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String s ;
	
		System.out.println("Enter a string");
		s = sc.nextLine();
		printInitials(s);  
	}
		

	}


