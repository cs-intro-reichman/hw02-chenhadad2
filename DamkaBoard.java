/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int i = 0;
		while (i < x) {
			int y = 0;
			while (y < x) {
				 System.out.print("* " );
				y++;
			}
			if (i%2==0) {
				 System.out.println( " " + " " );
				  System.out.print(" ");
			}
			else {
				 System.out.println();
			}
			i++;
	
}
	}
}

