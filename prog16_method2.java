//16.program to read two strings as user input and check if firsst contains second 
package assn;

import java.util.Scanner;
public class qu {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	String a,b;
	
	System.out.println("Enter the first String");
	a=s.nextLine();
	System.out.println("enter the second String");
	b=s.nextLine();
	boolean f=a.contains(b);//find if first string contains second
    if (f==true)
    	System.out.println(true); 
	}
}

