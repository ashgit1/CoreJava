package com.ashish.wf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharacterCount {

	public static void main(String[] args) {

		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		characterCountDisplay(s);
		in.close();
	}

	private static void characterCountDisplay(String str) {

		HashMap<Character, Integer> charHashTable = new HashMap<Character, Integer>();
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

		// Display the key + Value in combination by iterating through map.
		// Get a set representation of the map
		Set<Entry<Character, Integer>> set = charHashTable.entrySet();
		// Get the iterator
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		// Traverse the loop to print
		while(itr.hasNext()){
			Entry<Character, Integer> map = itr.next();
			if(map.getValue() == 1){
				System.out.print(map.getKey().toString());
			}else{
				System.out.print(map.getKey().toString() + map.getValue().toString());
			}
		}
		
		System.out.println("\nMap size: " + charHashTable.size());
		
	}
}
