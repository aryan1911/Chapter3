//14. program to find the first non repeating character in a string
package chap3;
import java.util.*;

public class prog14 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc = new Scanner (System.in);
      String s; //input string
      String s1="";//non repeating character
      int i,j,flag=0;
      System.out.println("enter the string");
      s = sc.nextLine();
      //extract a character and check if it is non repeating or not
      for(i = 0;i< s.length();i++)
      { 
    	   char ch = s.charAt(i);
    	   flag =0;
    	  for (j = i+1;j<s.length();j++)
    	  {
    		 if (ch == s.charAt(j))
    			 flag =1;
    		    
    	  }
    	  if (flag == 0)
    	  {
    	      s1=s1+ch;
    		  break;
    	     
    	  }
    	
      }
      System.out.println("the first non repeated character is : "+s1);
	}

}
