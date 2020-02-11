package chap3;

import java.util.Scanner;
import java.util.StringTokenizer;

//5. program to enter a string and print string in a format which says 1st letter of each wo4rd present in the string  printed in capital letters
public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s,a="";
		
		int l;
	
		System.out.println("Enter a string");
		s = sc.nextLine();
		l = s.length();
		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
		  a =st.nextToken (); //store the next token
		  a = a.toLowerCase(); //convert token to lower case
	
			System.out.print(Character.toUpperCase(a.charAt(0))+a.substring(1)+" ");
		}
	}

}

