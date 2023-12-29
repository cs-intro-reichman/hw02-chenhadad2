/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
		int y = 0;
        System.out.print(x);
		
    if (x < 10) {
	} 
		for (int i = 0; i<10; i++) {
			y = (int) (Math.random() * 10);
			if (y >= x){
			x = y;
				
    
	System.out.print(" " + x);
		}
		}
}
}