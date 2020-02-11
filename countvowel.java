//3. write a program to enter a string and count how many vowels are present
package chap3;

import java.util.Scanner;

public class countvowel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner (System.in);
		String s ;  //input string
		int l,c = 0; 
		System.out.println("Enter a string");
		s = sc.nextLine();
		 l = s.length();//stores length
		 s = s.toUpperCase();//cjhange to uppercase
		 
		 //loop to count no. of vowels
		 for (int i = 0;i<l;i++)
		 {
			 if (s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				c++;
		 }
		 System.out.println("no  of vowels present =  "+ c);
	}
}