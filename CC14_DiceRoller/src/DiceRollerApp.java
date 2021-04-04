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
				System.out.println(diceAndSides[0] + diceAndSides[1]);
				
			} else if (input.equals("exit")) {
				break;
			} else {
				System.out.println("Invalid Entry");
			}
			
		} while(!input.equals("exit"));
		System.out.println("Goodbye!");
	}
	
	public static int diceRoll(int s) {
		return (int)(Math.random()*s) + 1;
	}

}
