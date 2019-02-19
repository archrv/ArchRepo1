package org.somejavaprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your string: ");
		String my_String = sc.nextLine();
		char [] ch = my_String.toCharArray();
		Set <Character> my_Set = new LinkedHashSet<Character>();
		StringBuilder noDuplicates = new StringBuilder();
		for (char c : ch)
			my_Set.add(c);
		for (Character d : my_Set) 
			noDuplicates.append(d);
		
		System.out.println("String without duplicates: " + noDuplicates);
			
	}

}
