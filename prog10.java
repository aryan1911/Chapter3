//10. replace every occurence of the target string in the document eith the replacement string 
package chap3;

import java.util.Scanner;

public class prog10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s ;
	
		System.out.println("Enter a string");
		s = sc.nextLine();
  
  System.out.println( s.replaceAll("be","see"));//replace the string with required string
	}

}
