package com.ashish.wf;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEqualityCheckMain {

	public static void main(String[] args) {

		HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
		//Since we have overridden Country's equals method by using code, create Country's object using code.
		
		Country c1 = new Country();
		c1.setCode(101); c1.setName("India");
		
		Country c2 = new Country();
		c2.setCode(101); c1.setName("India");
		
		countryCapitalMap.put(c1, "Delhi");
		countryCapitalMap.put(c2, "Delhi");
		
		Iterator<Country> countryIterator = countryCapitalMap.keySet().iterator();
		while(countryIterator.hasNext()){
			Country countryObj = countryIterator.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println("Capital of " + countryObj.getCode() + "/" + countryObj.getName() + " :: " + capital);
		}
		
		System.out.println("Size of map: " + countryCapitalMap.size());
		
	}

}

/* hashcode for above two objects c1 and c2 are same(overridden by code), so Both will be point to same bucket,
now equals method will be used to compare them which  will return true.
This is the reason java doc says "if you override equals() method then you must override hashCode() method
*/