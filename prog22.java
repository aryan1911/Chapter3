//22. program to swap two string variables without using third or temp variable
package chapter3;
import java.util.Scanner;

public class prog22
{
	public static void main(String[] args)
	{
       Scanner sc = new Scanner (System.in);
       String s1,s2;
       System.out.println("enter 1st string");
       s1 = sc.nextLine();
       System.out.println("enter 2nd string");
       s2 = sc.nextLine();
       
       System.out.println("before swapping  \ns1 = "+s1+"\ns2 = "+s2);
       
       s1 = s1+s2;
       s2 = s1.substring(0,s1.length()-s2.length());
       s1 = s1.substring(s2.length());
       System.out.println("after swapping  \ns1 = "+s1+"\nks2 = "+s2);  
	}
    
}
