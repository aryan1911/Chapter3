package chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class indentingtext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		String inputLine;
		int nSpaces = 5;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader is = new BufferedReader(a);
		while ((inputLine = is.readLine()) != null) {
			int toRemove = 0;
			for (int i=0; i<nSpaces && i < inputLine.length() &&
			Character.isWhitespace(inputLine.charAt(i)); i++)
			++toRemove;
			System.out.println(inputLine.substring(toRemove));
			}
	}

}
