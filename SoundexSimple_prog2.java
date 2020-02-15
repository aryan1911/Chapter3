//2. Soundex Name Comparisions
package chap3;

public class SoundexSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String names [] = {"Darwin, Ian","David , Greg","Lok,Esh","Doni,lonoi"};
      for(String name : names) {
    	  System.out.println(Soundex.soundex(name)+' '+name);
      }
	}
	
}
 class Soundex

{
	static boolean debug = false;
	/* Implements the mapping
	 * from: AEHIOUWYBFPVCGJKQSXZDTLMNR
	 * to: 00000000111122222222334556
	 */
	public static final char[] MAP = {'0','1','2','3','0','1','2','0','0','2','2','4','5','5','0','1','2','6','2','3','0','1','0','2','0','2'};

	/** Convert the given String to its Soundex code.
	 * @return null If the given string can't be mapped to Soundex.
	 */
public static String soundex(String s)
{
	// Algorithm works on uppercase (mainframe era).

	String t = s.toUpperCase();
	StringBuffer res = new StringBuffer();
	char c, prev = '?', prevOutput = '?';
	// Main loop: find up to 4 chars that map.

	for (int i=0; i<t.length() && res.length() < 4 &&
			(c = t.charAt(i)) != ','; i++)
	{
		// Check to see if the given character is alphabetic.
		 // Text is already converted to uppercase. Algorithm
		 // only handles ASCII letters, do NOT use Character.isLetter()!
		 // Also, skip double letters.
		if(c>='A' && c<='Z' && c != prev) 
		{
			prev = c;
			// First char is installed unchanged, for sorting
			if (i==0)
			{
				res.append(c);
				} 
			else
			{
				char m = MAP[c-'A'];
				if (debug)
				{
				System.out.println(c + " --> " + m);
				}
				if (m != '0' && m != prevOutput)
				{
				res.append(m);
				prevOutput = m;
				}
				}
				}
				}
				if (res.length() == 0)
				return null;
				for (int i=res.length(); i<4; i++)
				res.append('0');
				return res.toString();
}		}
