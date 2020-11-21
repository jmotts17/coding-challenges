/*
 * 
 * Coding Challenge 7 - String Bits
 * 
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 * 
 */

public class StringBitsApp {

	public static void main(String[] args) {
		
		// Test Data
		System.out.println(stringBits("Hello"));
		System.out.println(stringBits("Hi"));
		System.out.println(stringBits("Heeololeo"));
		
	}
	
	/** 
	 * Passes a String and returns a new String with every other character.
	 * 
	 * @param str
	 * @return newStr
	 */
	public static String stringBits(String str) {
		String newStr = "";
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				newStr += strArray[i];
			}
		}
		
		return newStr;
	}
}
