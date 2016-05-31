package com.ashish.programinternal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) throws InputMismatchException{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		ArrayList<Integer> array_2 = new ArrayList<Integer>();
		ArrayList<Integer> array_3 = new ArrayList<Integer>();
		int prime=0;
		
		while (num != 1) {
			if (num % 2 == 0) {
				array_2.add(2);
				num = num / 2;
			} else if (num % 3 == 0) {
				array_3.add(3);
				num = num / 3;
			} else {
				prime = num;
				num/=num; 
			}
		}
		
		StringBuffer result = new StringBuffer();
		result.append("The prime factorizations are : ");
		
		if(array_2.size()!=0){
			result.append("2(" + array_2.size() + ")");
		}
		if(array_3.size()!=0){
			result.append("3(" + array_3.size() + ")");
		}
		if(prime!=0)
		{result.append(prime + "(" + 1 + ")");
		}
		
		System.out.println(result);
		scanner.close();
	}
}
