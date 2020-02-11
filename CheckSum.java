package chapter3;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckSum 
{
	
	public static int process(BufferedReader is) {
		int sum = 0;
		   try {
	         	String inputLine;
		       while ((inputLine = is.readLine()) != null)
		       {
		       int i;
		       for (i=0; i<inputLine.length(); i++) 
		        {
		          sum += inputLine.charAt(i);
		        }
		       }
		} catch (IOException e) {
		throw new RuntimeException("IOException: " + e);
		}
		return sum;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
