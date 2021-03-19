package week1.day1.assignments;



public class ArmstrongNumber {

	

	/*

	 * Goal: To find whether a number is an Armstrong number or not

	 * 

	 * inputs: 153

	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153

	 * 

	 * Shortcuts:

	 * 1) Print : type: syso, followed by: ctrl + space + enter

	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter

	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter

	 *   

	 * What are my learnings from this code?

	 * 1)

	 * 2)

	 * 3) 

	 * 

	 */

	

	public static void main(String[] args) {

		

				
		int input =153;

	// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int Cal=0,Rem,Ori;

	// Assign input into variable original 

		Ori=input;
   // Use loop to calculate: use while loop to set condition until the number greater than 0

		while (input < 0) {
	// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			Rem=(input%10);
	// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
            
			input=input/10;

	// Within loop: Add calculated with the cube of remainder & assign it to calculated
			Cal=Cal+(Rem*Rem*Rem);
		}						

	// Check whether calculated and original are same
		if (Cal==Ori) {
			
		}
					
	//When it matches print it as Armstrong number
		System.out.println("Print the Armstrong number"+Ori);
		

		

		



	}



}
