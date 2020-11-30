/*
 * 
 * Coding Challenge 5 - Rotate Left
 * 
 * Given an array of ints length 3, return an array with the elements 
 * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 * 
 */

public class RotateLeftApp {

	public static void main(String[] args) {

		int[] testArr1 = { 1, 2, 3 };
		int[] testArr2 = { 5, 11, 9 };
		int[] testArr3 = { 7, 0, 0 };

		int[] resultsArr = rotateLeft3(testArr1);
		
		for(int i = 0; i < resultsArr.length; i++) {
			System.out.print(resultsArr[i] + " ");
		}
	}

	public static int[] rotateLeft3(int[] nums) {

		int[] newArr = nums;

		for (int i = 0; i < nums.length; i++) {
				newArr[i] = nums[(i+1)];
		}

		return newArr;
	}
}
