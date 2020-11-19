/*
 * 
 * Coding Challenge 6 - Replace Chars
 * 
 * Get a sentence from the user and return it with all the vowels replaced with 
 * underscores ( _ ).
 * 
 */

public class ReplaceCharsApp {

	public static void main(String[] args) {
		
		// Create test strings
		String str1 = "The fox jumped over the log.";
		String str2 = "The dog wanted to take a walk to the park";
		
		// Output test string results
		System.out.println(replaceVowelsWithUnderscores(str1));
		System.out.println();
		System.out.println(replaceVowelsWithUnderscores(str2));

	}
	
	/**
	 * Takes in a string and returns a string with all the vowels replaced with a '_'.
	 * 
	 * @param s
	 * @return new String with vowels replaced as '_'
	 */
	public static String replaceVowelsWithUnderscores(String s) {
		return s.replaceAll("[aeiou]", "_");
	}
	
}
