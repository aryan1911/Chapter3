//15. program to remove title from a name
package chapter3;
import java.util.Scanner;

public class prog15
{

	public static void main(String[] args)
	{
Scanner sc = new Scanner (System.in);
   String s; //input string
     System.out.println("enter the string");
     s =sc.nextLine();
     
     int  i =  s.indexOf("."); //find the position of the .
     System.out.println(s.substring(i+1));//removes the title
	}
}
