package chapter3;

import java.util.StringTokenizer;

public class string_tokens_example {

	public static void main(String[] args) {
		System.out.println("\nDEMO 1");
		StringTokenizer st = new StringTokenizer("Hello World of Java");
		while (st.hasMoreTokens( ))
		System.out.println("Token: " + st.nextToken( ));
		
		System.out.println("\nDEMO 2");
		StringTokenizer st1 = new StringTokenizer("Hello, World|of|Java", ", |");
		while (st1.hasMoreElements( ))
		System.out.println("Token: " + st1.nextElement( ));

		System.out.println("\nDEMO 3");
		StringTokenizer st3 =
				new StringTokenizer("Hello, World|of|Java", ", |", true);
				while (st3.hasMoreElements( ))
				System.out.println("Token: " + st3.nextElement( ));
	}

}
