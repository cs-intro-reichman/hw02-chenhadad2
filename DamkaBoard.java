/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		for (int i = 1; i <= x; i++) {
				System.out.println();
				
			for (int j = 0; j < x; j++)
				if (i % 2 ==0) {
					System.out.print("* ");
			} else {
			System.out.print(" *");

	
}
	}
}

