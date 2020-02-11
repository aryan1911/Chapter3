//17.program to remove all occurences of a given character from an input string
package chap3;
import java.util.Scanner;

public class prog17_method2 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s,s1="";
		System.out.println("Enter the string");
		s = sc.nextLine();
	    System.out.println("enter the character to be removed from the string");
	    char ch  = sc.next().charAt(0);
	    
	    for(int i  =0;i<s.length();i++)
	    {
			if(s.charAt(i)!= ch)
	    		s1= s1 + s.charAt(i);
	    }
	    System.out.println(s1);
	}
}
