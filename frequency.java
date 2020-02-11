// 4 . program to find the frequency of each character present in it
package chap3;

import java.util.Scanner;

public class frequency
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String s ;
		int l;
	
		System.out.println("Enter a string");
		s = sc.nextLine();
		l = s.length();
	   int freq []	= new int[l];
	   int i, j;  
       
       //Converts given string into character array  
       char c[] = s.toCharArray();
       
       for (i=0;i<l;i++)
       {
    	   freq[i]= 1;
    	   for(j = i+1; j <s.length(); j++) 
    	   {  
               if(c[i] == c[j]) 
               {  
                   freq[i]++;  
                     
                   //assign c[j] to 0 to avoid printing visited character  
                   c[j] = '0';  
       }
	}

}      
       System.out.println("Characters and their corresponding frequencies");  
       for(i = 0; i <freq.length; i++) {  
           if(c[i] != ' ' && c[i] != '0')  
               System.out.println(c[i] + "-" + freq[i]);
         
	}
}
}