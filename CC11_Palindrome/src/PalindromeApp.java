/*
 * 
 * Coding Challenge 11 - Palindrome
 * 
 * A palindrome is a word, phrase, number or sequence of words that reads the same backward as forward.
 * The tests for only a single word and outputs "Yes" if it is a palindrome or "No" if it is not.
 * 
 */

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String A=sc.next();
        int maxLength = A.length()-1;
        
        String response = "Yes";
        
        for(int i=0; i < A.length() -1; i++) {
            if(A.charAt(i) == A.charAt(maxLength)) {
                maxLength--;
                continue;
            }
            response = "No";
        }
        
        System.out.println(response);

	}

}
