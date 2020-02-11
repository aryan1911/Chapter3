//12. progra to converts its string parameter so that letters are written in blocks of five characters long
package chap3;

import java.util.Scanner;
public class prog12 
{
	public static void main(String[] args) 
     
      		int c= 0; //separate words into group of 5
      		String s1="";
      		String s2="";
      		Scanner sc=new Scanner(System.in);
      		System.out.println("Enter a string");
      		String s=sc.nextLine();
      		//remove all spaces from the string
              for(int i=0;i<s.length();i++)
              {
              	char ch=s.charAt(i);
              	if(ch!=' ')
              		s1=s1+ch;
              	else 
              		s1=s1+"";
           
      	}  
              s2 = s2 + s1.charAt(0); //store the first character
              //loop to take groups of 5
              for(int i=1;i<s1.length();i++)
              {
              	char ch1=s1.charAt(i);
              
              	c++;
              		if(c%5==0)
              		{
              			s2=s2+" "+ch1;
              		}
              		else
              			s2=s2+ch1;
           
      	}  
              System.out.println(s2);  	  
	}       
}
