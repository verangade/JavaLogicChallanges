package com.test.palindrome;

public class PalindromeTest {
    public static boolean isPalindrome(String word) {
    	word = word.toLowerCase();
    	boolean result=true;
    	char[] words = word.toCharArray();
    	for (int i = 0; i < words.length/2; i++) {
			if(words[i]!=words[words.length-(i+1)]) {
				result=false;
				break;
				
			}
		}
    	return result;
    }
    
    public static void main(String[] args) {
        System.out.println(PalindromeTest.isPalindrome("Deleveled"));
    }
}