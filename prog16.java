package chap3;

import java.util.Scanner;

public class prog16 {
     
	public static boolean contains(String s1,String s2)
	
	{
		boolean f = false;
	     for (int i = 0; i < s2.length() - 1; i++) 
	     {
	       if (s2.charAt(i) == s1.charAt(0))
	       {
	         for (int j = 0; j < s1.length(); j++) 
	         {
	           if ((i + j) < s2.length() && s1.charAt(j) == s2.charAt(i + j) && j == s1.length() - 1) 
	           {
	             f = true;
	             break;
	           }
	         }
	       }
	     }  
	     return f;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        String s1,s2;
        System.out.println("enter the first string :");
        s1 = sc.nextLine();
        
        System.out.println("enter the second string :");
        s2 = sc.nextLine();
        
        System.out.println("If the second string contains the first one? "+contains(s1, s2));
        
	}

}
