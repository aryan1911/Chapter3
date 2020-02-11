//program to capitalize first alphabet of each word in a string
package chapter3;

import java.util.Scanner;

public class prog21 {

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner (System.in);
		String s,s1="";
		System.out.println("enter the string :");
		s = sc.nextLine();
	    
		s1 += Character.toUpperCase(s.charAt(0));
	
		
		for (int i = 1;i<s.length();i++)
		{
		   	if (s.charAt(i)!=' ')
		   		s1 = s1 + s.charAt(i);
		   	else
		   	{
		   		s1 = s1+" "+Character.toUpperCase(s.charAt(i+1));
			i++;}
		}
		System.out.println(s1);
	}

}
