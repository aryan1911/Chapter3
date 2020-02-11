package chap3;

import java.util.Scanner;

// 6 .program to  enter n number of string and arrange in ascending order
public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
        	a[i] = s.nextInt();
        }
        
        //loop to arrange the string in ascending order
        for (int i = 0; i < n; i++) 
        {
        	for (int j = i + 1; j < n; j++)
        	{
        		//swapping
        		 if (a[i] > a[j]) 
        		 {
        			 temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
        		 }
        	}
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
        	System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
	}
	}


