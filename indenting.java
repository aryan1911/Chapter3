package chap3;
import java.io.*;

public class indenting {

	public static void main(String[] args) throws IOException {
		
		int nSpaces = 5;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader is = new BufferedReader(a);
		String inputLine;
		// TODO Auto-generated method stub
		while ((inputLine = is.readLine()) != null) {
			for (int i=0; i<nSpaces; i++) System.out.print(' ');
			System.out.println(inputLine);
			}
	}

}
