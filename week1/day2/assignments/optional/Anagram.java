package week1.day2.assignments.optional;

public class Anagram {
	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	String text1 = "stops";

		String text2 = "potss"; 
	    if(text1.length() == text2.length()) 
	    {
	    	char[] chararray1= text1.toCharArray();
	    	char[] chararray2= text2.toCharArray();
	    	Arrays.sort(chararray1);
	    	Arrays.sort(chararray2);
	    	boolean Result = Arrays.equals(chararray1, chararray2);
	        if(Result) {
	        System.out.println(text1 + " and " + text2 + " are anagram.");
	      }
	      else {
	        System.out.println(text1 + " and " + text2 + " are not anagram.");
	      }
	    }
	    

	}


}
