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
		if(arrowSize % 2 == 0) {
			arrowSize++;
		}
		
		// Call createArrow method
		createArrow(arrowSize);
	}
	
	public static void createArrow(int arrowSize) {
		
		for(int i = 0; i < arrowSize; i++) {
			for(int j = 0; j <= i; j++) {
				if(i <= (arrowSize / 2)) {
					System.out.print(">");
				} else {
					System.out.print(">");
					j++;
				}
			}
			System.out.println();
		}
	}

}
