package chap3;



import java.util.Scanner;

public class prog28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1,s2,s3="";
       int i,index= 0;
       boolean f = false;
       Scanner sc = new Scanner (System.in);
       System.out.println("enter the string ");
       s1 =  sc.nextLine();
       
       System.out.println("enter the substring ");
       s2 = sc.nextLine();
       int j = (s1.length()%s2.length())+1;
       if(s1.contains(s2))  
       {
    	   for(i =0;i<s1.length();i++)
    	   {    
    		   if(j!=0)
    		   {
    			   
    		   j--;
    		   s3 = s1.substring(i,i+s2.length());
    		   
    		  System.out.println(s3);
    		  if(s2.equalsIgnoreCase(s3))
    			  System.out.println("true"+i);
    		  else
    			  System.out.println("false"+i);
    		  
    		       
    		   }
    	   }
       }
    
       
       
      /* if(f == true)
    	   System.out.println("index where "+s2+" is found : "+ index);
       else
    	   System.out.println(-1);*/
	}
}
