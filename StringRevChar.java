//8. Check whether the given string is palindrome or not
package chapter3;

import java.util.Stack;
import java.util.StringTokenizer;

import java.util.Scanner;

public class StringRevChar {

	public static void main(String[] args) {
		
       String sh = "FCGDAEB"; //given string
       String p ;
       boolean f;
       
       
       System.out.println(sh + " -> " + new StringBuilder(sh).reverse( ));
       String s = "Father Charles dad Down And Ends Battle";
       palindrome a = new palindrome ();
       Stack <String> myStack = new Stack<>();
       StringTokenizer st = new StringTokenizer (s);
       while(st.hasMoreTokens()) {
    	   myStack.push(st.nextToken());
    	
       }
       
       System.out.print('"' + s + '"' + " backwards by word is:\n\t\"");
       while (!myStack.empty()) {
        p = myStack.pop();
        System.out.println(p);
       System.out.print(' ');
       f = a.palin(p);
       if (f == true)
  		 System.out.println("palindrome");
  	 else 
  		 System.out.println("not palindrome");
       }
       System.out.println('"');
	
	
     
	} 
	}

//check if palindrome or not int the function by reversing the string
class palindrome
{
	public boolean palin(String str)
	{  
		String rev="";
		
		for(int i = str.length()-1;i>=0;i--)
			rev = rev + str.charAt(i);
		if (rev.equals(str))
			return true;
		else
			return false;
			
	}
}

