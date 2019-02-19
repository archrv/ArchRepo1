package org.somejavaprograms;

import java.util.Scanner;

public class NumLinesSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter no.of lines required: ");
		int linesnum = s.nextInt();
		int count=0;
		for (int i=1; i<=linesnum; i++) {
			count = count*10 + i; 
			System.out.println(count);
		}

	}

}
