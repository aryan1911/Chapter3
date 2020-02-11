package chapter3;

import java.util.Scanner;

public class prog29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner (System.in);
		 
		String str ; 
		System.out.println("enter the string ");
		str = sc.next();
		
    	        int[] freq = new int[str.length()];  
    	        char maxChar = str.charAt(0);  
    	        int i, j,max;          
    	          
    	        //Converts given string into character array  
    	        char string[] = str.toCharArray();  
    	          
    	        //Count each word in given string and store in array freq  
    	        for(i = 0; i < string.length; i++) {  
    	            freq[i] = 1;  
    	            for(j = i+1; j < string.length; j++) {  
    	                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
    	                    freq[i]++;  
    	                      
    	                    //Set string[j] to 0 to avoid printing visited character  
    	                    string[j] = '0';  
    	                }  
    	            }  
    	        }  
    	          
    	        //Determine minimum and maximum occurring characters  
    	       max = freq[0];  
    	        for(i = 0; i <freq.length; i++) 
    	        {  
    	              
    	          
    	            if(max < freq[i])
    	            {  
    	                max = freq[i];  
    	                maxChar = string[i];  
    	            }  
    	        }  
    	          
    	         
    	        System.out.println("Maximum occurring character: " + maxChar);  
    	    }  
    	}  