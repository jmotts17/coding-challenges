/*
 * 
 * Coding Challenge 2 - Arrowhead
 * 
 * This challenge involves the use of control statements.  Prompt the user to provide the size of an 
 * arrowhead. The app will print an arrowhead in the console , line by line, for the # of lines given
 * by the user.
 * 
 */

import java.util.Scanner;

public class ArrowheadApp {

	public static void main(String[] args) {

		// Create Scanner Object
		Scanner scanner = new Scanner(System.in);

		// Prompt user for arrow size
		System.out.print("Please enter the size of the arrow [3 or more]: ");
		int arrowSize = scanner.nextInt();

		// If arrow size is even, add a row for middle row
		if (arrowSize % 2 == 0) {
			arrowSize++;
		}

		// Call createArrow method
		createArrow(arrowSize);
	}
	
	/**
	 * This method takes in an arrow size and then uses 2 nested for loops to
	 * create an arrowhead. The first nested for loop creates the first half 
	 * of the arrowhead. The second nested for loop creates the bottom half  
	 * including the tip.
	 * 
	 * @param arrowSize
	 */
	public static void createArrow(int arrowSize) {
		for (int i = 0; i <= arrowSize / 2; i++) {
			for (int j = 0; j <= i; j++) {
					System.out.print(">");
			}
			System.out.println();
		}
		for(int i = arrowSize / 2; i <= arrowSize; i++) {
			for (int j = i; j <= arrowSize; j++) {
				System.out.print(">");
			}
			System.out.println();
		}
	}
}
