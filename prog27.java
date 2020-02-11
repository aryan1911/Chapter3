package chap3;

import java.util.Scanner;

public class prog27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s1,s2,s3;
		System.out.println("enter the first string : ");
		s1 = sc.nextLine();
		System.out.println("enter the second string : ");
		s2 = sc.nextLine();	
		System.out.println("enter the three string : ");
		s3 = sc.nextLine();
		
		if (contains(s1,s2,s3)== true)
			System.out.println(s1+ " and "+s2+ " are contained in  "+s3);
		else 
			System.out.println(s1 + " and "+s2+" are not contained in "+s3);
		
	}
  public static boolean contains(String s1,String s2,String s3)
 {
	 int i,j,k;
	 i = j = k =0;
	 
	 while (k!= s3.length())
	 {
		 if(i<s1.length() && s1.charAt(i)==s3.charAt(k))
			 {
			 i++;
			
			 }
		 else if(j<s2.length()&& s2.charAt(j)==s3.charAt(k))
		 {
			 j++;
			 
		 }
		 else
			 return false;
		 k++;
		 
	 }
	 
	 if(i<s1.length()||j<s2.length())
		 {  
		 System.out.println("returning from if block");
		 return false;
		 }
	     return true;
 }
}