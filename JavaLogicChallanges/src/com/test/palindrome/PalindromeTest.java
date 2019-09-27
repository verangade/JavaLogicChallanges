package com.test.palindrome;

/**
 * 
 * 

A palindrome is a word that reads the same backward or forward.

Write a function that checks if a given word is a palindrome. Character case should be ignored.

For example, isPalindrome("Deleveled") should return true as character case should be ignored, resulting in "deleveled", which is a palindrome since it reads the same backward and forward.

 *
 */

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