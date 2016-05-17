package com.ashish.wf;

import java.util.Hashtable;
import java.util.Scanner;

public class FirstNonRepeated {

	public static void main(String[] args) {

		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Character c = firstNonRepeatedCharacter(s);
		if(c==null){
			System.out.println("None of the characters in " + s + " occurs single time" );
		}
		else{
			System.out.println("The first non repeated character is :  " + c);
		}
		in.close();
	}

	private static Character firstNonRepeatedCharacter(String str) {

		Hashtable<Character, Integer> charHashTable = new Hashtable<Character, Integer>();
		int i, length;
		Character c;
		length = str.length();
		// Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charHashTable.containsKey(c)) {
				// increment count corresponding to c
				charHashTable.put(c, (charHashTable.get(c) + 1));
			} else {
				// add that key for the first time
				charHashTable.put(c, 1);
			}
		}

		// Search charHashTable in order of string str. The first character
		// having count 1 is the desired one.
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charHashTable.get(c) == 1) {
				return c;
			}
		}
		return null;
	}
}
