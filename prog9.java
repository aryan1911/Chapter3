//9. program to write a method that takes a delimited string to store a name and address from which you can print mailing address 
package chap3;

import java.util.Scanner;
import java.util.StringTokenizer;
public class prog9 
{
         
	 public static void mailaddress(String str)
	 {
		 //set new delimeter
		 StringTokenizer st =  new  StringTokenizer(str,",");
		 
		 while (st.hasMoreElements())
			System.out.println(st.nextElement()); //print the tokens
	 
	 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s; //input from user 
		System.out.println("Enter a string");
		s = sc.nextLine();
	     mailaddress(s); //function calling
	}
}
