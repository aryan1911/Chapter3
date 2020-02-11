package chapter3;

import java.util.Scanner;

public class prog30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        int n;
        String s[] = null;
        System.out.println("enter the number of elements");
        n = sc.nextInt();
        System.out.println("enter the string array");
        for(int i = 0; i<n; i++)
        s[i] = sc.next();
        
        sort(s,n);
	}
public static void sort(String s[],int n)
{ int j;
	for (int i = 1;i<n;i++)
	{
		String s1;
		s1 = s[i];
		for ( j = i-1;j>=0 && s1.length()<s[j].length();j--)
		{
			s[j+1]= s[j];
			
		}
		s[j+1]= s1;
	}
	for (int k =0;k<n; k++)
		
		System.out.println(s[k]+" ");
}
}
