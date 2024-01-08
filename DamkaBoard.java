/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		// TODO: fix identations! It's a big mess!
	
	for (int i = 0; i < x; i++) { // TODO: i, j, x - bad names. Better would be row, col and inputNum
		 System.out.println();
		 for (int j = 0; j < x; j++) {
			 if (i % 2 == 0) {
				  System.out.print("* ");
			 } else {
				  System.out.print(" *");
			 }
	
}
	}
}
}

