/*
 * 
 * Coding Challenge 10 - Stop Watch
 * 
 * Create an app that tracks time. You could start tracking time when the user enters the word 'start',
 * then stop tracking when they enter 'stop'.
 * 
 */

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatchApp {

	public static void main(String[] args) {
		// Output welcome message
		System.out.println("Welcome to the Stop Watch Application!");
		
		// Declare scanner / variables
		Scanner scanner = new Scanner(System.in);
		String response = "";
		
		do {
			// Start
			String start = "";
			while(!start.equalsIgnoreCase("start")) {
			System.out.print("\nPlease enter 'start': ");
			start = scanner.nextLine();
			}
			LocalTime startTime = LocalTime.now();
			
			// Stop
			String stop = "";
			while(!stop.equalsIgnoreCase("stop")) {
				System.out.print("\nPlease enter 'stop': ");
				stop = scanner.nextLine();
			}
			LocalTime endTime = LocalTime.now();
			
			// Calculate duration / Output results
			long duration = Duration.between(startTime, endTime).getSeconds();
			System.out.println("\nThat took " + duration + " seconds!");
			
			// Prompt user to continue
			System.out.print("\nContinue? (y/n): ");
			response = scanner.nextLine();
		} while (response.equalsIgnoreCase("y"));
		
		// Output ending message
		System.out.println("\nBye!");
	}
}
