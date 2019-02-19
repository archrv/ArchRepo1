package org.somejavaprograms;

import java.util.Scanner;

public class PrintNumericsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphanumeric string that you wana check: ");
		String my_string = sc.nextLine();
		StringBuilder alpha_string = new StringBuilder();
		StringBuilder numeric_string = new StringBuilder();
		
		for (int i=0; i<my_string.length(); i++) {
			Character ch = my_string.charAt(i);
			if (Character.isDigit(ch))
				numeric_string.append(ch);
			if (Character.isAlphabetic(ch))
				alpha_string.append(ch);
		}
		
		System.out.println("Your Numeric string is: " + numeric_string);
		System.out.println("Your Alphabetic string is: " + alpha_string);

	}

}
