/*
 * 
 * Coding Challenge 1 - Make Chocolate
 * 
 * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
 * and big bars (5 kilos each). Return the number of small bars to use, assuming we 
 * always use big bars before small bars. Return -1 if it can't be done.
 * 
 */

public class MakeChocolateApp {

	public static void main(String[] args) {
		// Test Cases
		System.out.println(makeChocolate(4, 1, 9));
		System.out.println(makeChocolate(4, 1, 10));
		System.out.println(makeChocolate(4, 1, 7));
		System.out.println(makeChocolate(4, 1, 5));
	}
	
	/**
	 * Calculates the number of small bars needed to meet the chocolate goal.
	 * If the goal can't be met, return -1. Otherwise return the # of small bars.
	 * 
	 * @param small
	 * @param big
	 * @param goal
	 * @return smallBarsUsed
	 */
	public static int makeChocolate(int small, int big, int goal) {
		int totalChocolate = 0;
		int smallBarsUsed = 0;
		while(totalChocolate < goal) {
			if(big > 0) {
				totalChocolate+= 5;
				big--;
			} else if (small > 0) {
				totalChocolate+=1;
				small--;
				smallBarsUsed++;
			} else {
				return -1;
			}
		}
		return smallBarsUsed;
	}
}