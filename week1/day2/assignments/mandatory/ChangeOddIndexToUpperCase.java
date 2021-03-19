package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
	
	
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changename";

        char[] ch = test.toCharArray();
     
        for (int i = 0; i < test.length(); i++) {
        	  if (i % 2 == 0)
        	  {
        		    char crt = test.charAt(i);
        		      if (i % 2 == 1) {
        		          System.out.print(Character.toLowerCase(crt));
        		      } else {
        		          System.out.print(Character.toUpperCase(crt));
        		      }
        		  }
        		  System.out.println();
          		}
            
        }

}
