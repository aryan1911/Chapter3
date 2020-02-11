//11. program that searches for ssingle digit numbers in a text and changes them totheir corressponding words
package chap3;

import java.util.Scanner;
public class prog11 
{

			public static void main(String args[])
			{
				
			Scanner sc=new Scanner(System.in);
			String s1="";
		    System.out.println("Enter a String");
		    String s=sc.nextLine();
		    for(int i=0;i<s.length();i++)
		     {
			  char ch=s.charAt(i);
			  if(ch=='0')
				  s1=s1+"zero";
			  else if(ch=='1')
				 
			      s1=s1+"one";
			  else if(ch=='2')
				  s1=s1+"two";
			  else if(ch=='3')
				  s1=s1+"three";
			  else if(ch=='4')
				  s1=s1+"four";
			  else if(ch=='5')
				  s1=s1+"five";
			  else if(ch=='6')
				  s1=s1+"six";
			  else if(ch=='7')
				  s1=s1+"seven";
			  else if(ch=='8')
				  s1=s1+"eight";
				  else if(ch=='9')
					  s1=s1+"nine";
				  else
					  s1=s1+ch;
					 
		     }
		    System.out.print(s1);
		    	
		}

		
		}
	


