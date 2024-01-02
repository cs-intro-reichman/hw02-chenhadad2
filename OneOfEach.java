public class OneOfEach {
    public static void main(String args[]) {

        int x = 0;
        int kids = 0;
        String genders = " ";
        char latestGender = genders.charAt(genders.length() - 1 );
        boolean isfamily = false;
		
        while (!isfamily) {

            x = (int) ( 1 + Math.random() * 2);
			kids++;
			
            if(x == 2) {
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

        System.out.println(genders);
        System.out.println("You made it... and you now have "+ kids + " children.");
    }
    }
	