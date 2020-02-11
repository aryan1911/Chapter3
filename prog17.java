package chapter3;

import java.util.Scanner;

public class prog17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		char ch;
		String s;
		System.out.println("enter the string :");
		s = sc.nextLine();
		System.out.println("enter the character you want to remove from the string");
		ch = sc.next().charAt(0);
		
		remove(ch,s);
	}
	
	public static void remove (char ch,String s)
	{
		int i,j,c=0;
		char [] a = s.toCharArray();
		for(i =0,j=0;i<s.length();i++)
		{
			if(a[i]!=ch)
				a[j++]= a[i];
			else
				c++;
		}
		while (c>0)
		{a[j++]= '\0';
		c--;
		}
		
		System.out.println(a);
	}

}
