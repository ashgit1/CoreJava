package com.ashish.wf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCount {

	public static void main(String[] args) {

		Map<Employee, String> mapCount = new HashMap<Employee, String>();
		
		mapCount.put(new Employee(1, "Ashish", "Gupta"), "Object 1"); 
		mapCount.put(new Employee(1, "Ashish", "Gupta"), "Object 1"); 
		mapCount.put(new Employee(1, "Ashish", "Gupta"), "Object 1"); 
		
		/*mapCount.put(new Employee(1, "Ashish", "Gupta"), "Object 1"); 
		mapCount.put(new Employee(2, "Ashish", "Gupta"), "Object 1"); 
		mapCount.put(new Employee(3, "Ashish", "Gupta"), "Object 1"); 
		*/
		
		System.out.println("Size of Map: " + mapCount.size());
		
		Set<Map.Entry<Employee, String>> set = mapCount.entrySet();
		Iterator<Map.Entry<Employee, String>> itr = set.iterator();
		while(itr.hasNext()){
			Entry<Employee, String> map = itr.next();
			System.out.println("key : " + map.getKey().fname + map.getKey().lname + map.getKey().eid + 
								", value: " +map.getValue());
		}
		
	}

}
