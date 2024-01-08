/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
		int y = 0;
        System.out.print(x);
		//TODO: here you have also a big mess with identations, the code should be clean and readable		

	// TODO: what is this? it do nothing. The code should be clean.
    if (x < 10) {
	} 

		/*
		 * Wrong solution! 
		 * It was asked to stop generate numbers after descreasing number was found
		 * You just stop after 10 attempts (why 10?)
		 */
		for (int i = 0; i<10; i++) {
			y = (int) (Math.random() * 10);
			if (y >= x){
			x = y;
				
    
	System.out.print(" " + x);
		}
		}
}
}