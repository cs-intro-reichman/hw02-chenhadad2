/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = (args[0]);
		int length =  s.length();
		String sOut = " ";
		int middle = (length-1)/2;
		for (int i = length-1; i>=0; i--) {
			char c = s.charAt(i);
			sOut = sOut + c;
		}
	
			System.out.print(sOut);
			System.out.println();
			System.out.println("The middle character is" + " " + s.charAt(middle));

	}
}
