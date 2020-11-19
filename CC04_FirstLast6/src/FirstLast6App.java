
/*
 * 
 * Coding Challenge 4 - First Last 6
 * 
 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
 * The array will be length 1 or more.
 * 
 */

public class FirstLast6App {

	public static void main(String[] args) {
		
		// Create test arrays
		int[] arr1 = {1, 2, 6};
		int[] arr2 = {6, 1, 2, 3};
		int[] arr3 = {13, 6, 1, 2, 3};
		
		// Output test results
		System.out.println(firstLast6(arr1));
		System.out.println(firstLast6(arr2));
		System.out.println(firstLast6(arr3));
		
	}
	
	/**
	 * Checks to see if the first or last number in the array is a 6.
	 * 
	 * @param nums
	 * @return true/false
	 */
	public static boolean firstLast6(int[] nums) {
		int lastNum = nums.length - 1;
		
		if(nums[0] == 6 || nums[lastNum] == 6) {
			return true;
		}
		
		return false;
	}

}
