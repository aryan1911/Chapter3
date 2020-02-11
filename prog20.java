//20. program to input a string from user and reverse each word of the string
package chapter3;
import java.util.Scanner;

public class prog20 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
	
		String s; //input sstring
		System.out.println("enter the string :");
		s = sc.nextLine();
	    String rev = reverse(s);//function calling	
	    
	    System.out.println(rev);
	}
	//function to reverse the string
	public static String reverse(String s)
	{
		String s1="",rev= "";
	
	  
	for (int i =0;i<s.length();i++)
	{
		s1 = s1+ s.charAt(i);
		
		if((s.charAt(i)== ' ')||(i == s.length()))
				{
			      for(int j = s1.length()-1;j>=0;j--)
			      {
			    	  rev = rev + s1.charAt(j);
			    	  if ((j==0) &&(i!= s.length()))
			    		  rev += " ";
			      }
			      s1 = "";
				}
	}
   	return rev;
	}
}


