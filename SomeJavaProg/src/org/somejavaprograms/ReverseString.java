package org.somejavaprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to be reversed: ");
		String my_string = sc.nextLine();
		String rev = "";
		for (int i=my_string.length()-1; i>=0; i--) 
			rev = rev + my_string.charAt(i);
		
		System.out.println("Reversed string is: " + rev);
	}

}
