/*
 * D&D Dice Roller Challenge found on Reddit
 * 
 * I love playing D&D with my friends, and my favorite part is creating character sheets. One major part of making character sheets is rolling the character's stats.
 * Sadly, I have lost all my dice, so I'm asking for your help to make a dice roller for me to use!
 * The first number is the number of dice to roll, the d just means "dice", it's just used to split up the two numbers, and the second number is how many sides the dice have.
 * So the above example of "3d6" means "roll 3 6-sided dice". 
 * The first number, the number of dice to roll, can be any integer between 1 and 100, inclusive.
 * The second number, the number of sides of the dice, can be any integer between 2 and 100, inclusive.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;

		do {
			System.out.print("Enter number of dice to roll and how many sides seperated by a \"d\" (Ex. 4d6) or \"exit\" to quit: ");
			input = scanner.next();
			
			if(input.contains("d") ) {
				String[] diceAndSides = input.split("d");
				ArrayList<Integer> rolls = new ArrayList<Integer>();
				int numOfDice = Integer.parseInt(diceAndSides[0]);
				int numOfSides = Integer.parseInt(diceAndSides[1]);
				int total = 0;
				for(int i=0; i < numOfDice ; i++) {
					int dieRoll = dieRoll(numOfSides);
					rolls.add(dieRoll);
					total += dieRoll;
				}
				System.out.print("Total: " + total + " Rolls: ");
				for(Integer roll : rolls) {
					System.out.print(roll + " ");
				}
				System.out.println();
			} else if (input.equals("exit")) {
				break;
			} else {
				System.out.println("Invalid Entry");
			}
			
		} while(!input.equals("exit"));
		System.out.println("Goodbye!");
	}
	
	public static int dieRoll(int s) {
		return (int)(Math.random()*s) + 1;
	}

}
