//19. program to check if a string contains only digits
package chapter3;
import java.util.Scanner;

public class prog19 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		boolean c = false;  //flag variable
		String s;//input string
		System.out.println("enter the string :");
		s = sc.nextLine();
		c= digitsonly(s);//function calling
		if (c== false)
			System.out.println("String not contains only digits");
		else
			System.out.println("String contains only digits");
		
	}
	//method to check if string contains digit only
	public static boolean digitsonly(String s)
	{
		for (int i = 0; i < s.length(); i++) {
		      if (!Character.isDigit(s.charAt(i)))
		     return false;	 
		}
		return true;
	}
}
