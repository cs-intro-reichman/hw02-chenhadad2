import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.

public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed); 	
	
	double rnd = 0;
    int kids = 0;
    String genders = " ";
    char latestGender = genders.charAt(genders.length() - 1 );
    boolean isfamily = false;
	int twochilds = 0;
	int threechilds = 0;
	int fourormore = 0;
	double average = 0;
	int avgKid = 0;
	
	for (int i = 0; i < T; i++) {
		isfamily = false;
         kids = 0;
         genders = " ";
         latestGender = genders.charAt(genders.length() - 1 );
		
		
		while (!isfamily) {

		 rnd = generator.nextDouble();
			kids++;
			
	

			if(rnd >= 0.5) {
                genders += " b";
            }

            else {
                genders += " g";
            }
			
            if ( kids != 1 && latestGender != genders.charAt(genders.length() - 1 ) ) {
               isfamily = true;
			   
            }

      
            latestGender = genders.charAt(genders.length() - 1 );
			
        }
		
			 avgKid += kids;
			 
			if  (kids == 2) {
			twochilds = twochilds + 1;
		 	} if (kids == 3) {
			threechilds = threechilds + 1; 
		 		} if (kids >= 4) {
			fourormore = fourormore + 1;
		
				}
	}				
	
		average = (double) avgKid/T;
		
		System.out.println("Average:" + " " + average + " " + "children to get at least one of each gender.");
		
		System.out.println("Number of families with 2 children:" + " " + twochilds);
		
        System.out.println("Number of families with 3 children:" + " " + threechilds);
		
		 System.out.println("Number of families with 4 or more children:" + " " + fourormore);
		 
	  if ((twochilds > threechilds) && (twochilds > fourormore)){
		System.out.println("The most common number of children is 2.");

	} if ((threechilds > twochilds) && (threechilds > fourormore)){
		System.out.println("The most common number of children is 3.");
		
	} if ((fourormore > twochilds) && (threechilds < fourormore)) {
		System.out.println("The most common number of children is 4 or more.");
	}
		
		
	}
	
}
