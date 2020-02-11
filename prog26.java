package chapter3;

import java.util.Scanner;

public class prog26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String s;
      int v,c;
      v = c = 0;
      System.out.println("enter the string : ");
      s = sc.nextLine();
      
     
  
      
      s = s.toLowerCase();
      
      for(int i = 0;i<s.length();i++)
      {
    	  char ch = s.charAt(i);
    	  if (ch=='a'||ch=='e'||ch =='i'||ch=='o'||ch =='u')
    		  v++;
    	  else if (ch>='a'&& ch<='z'&&ch!= ' ')
    		  c++;
      }
      System.out.println(c+" consonants and "+v+" vowels");
	}

}
