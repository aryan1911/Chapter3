package chap3;

public class controllingcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name = "Java Cookbook";
      System.out.println("Normal:\t"+ name);
      System.out.println("Upper:\t"+name.toUpperCase());
      System.out.println("Lower:\t"+name.toLowerCase());
      String javaName = "java cookBook";
      if(!name.contentEquals(javaName))
      System.err.println("equals() correctly reports false");
      else
    	  System.err.println("equals() correctly reports true");
      
      if (name.equalsIgnoreCase(javaName))
    	  System.err.println("equalsIgnoreCase() correctly reports true");
      else
    	  System.err.println("equalsIgnoreCase() correctly reports false");
          	  
	}

}
