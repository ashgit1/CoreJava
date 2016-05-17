package com.ashish.mmt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String to validate");
		String palindromeTocheck = reader.readLine();
		if(isPhrasePalindrome(palindromeTocheck)){
			System.out.println(palindromeTocheck + " is Palindrome");
		}else{
			System.out.println(palindromeTocheck + " is not Palindrome");
		}
	}
	
	public static boolean isPhrasePalindrome(String text) {
	    String chars = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
	    return isTextPalindrome(chars);
	}
	
	public static boolean isTextPalindrome(String text) {
	    if (text == null) {
	        return false;
	    } 
	    int left = 0;
	    int right = text.length() - 1;
	    while (left < right) {
	        if (text.charAt(left++) != text.charAt(right--)) {
	            return false;
	        }
	    }
	    return true;
	}

}
