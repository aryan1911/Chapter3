
package chapter3;
import java.util.Scanner;

//Java program to print all permutations of a 
//given string. 
public class prog25 
{ 
	public static void main(String[] args) 
	{   
		 Scanner sc = new Scanner (System.in);
		 
		String str ; 
		System.out.println("enter the string ");
		str = sc.next();
		
		int n = str.length(); 
		prog25 permutation = new prog25(); 
		permutation.permute(str, 0, n-1); 
	} 

	
	private void permute(String str, int l, int r) 
	{ 
		if (l == r) 
			System.out.println(str); 
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				permute(str, l+1, r); 
				str = swap(str,l,i); 
			} 
		} 
	} 

	public String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 

} 

