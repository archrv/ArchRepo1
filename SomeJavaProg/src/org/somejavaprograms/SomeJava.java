package org.somejavaprograms;

public class SomeJava {

	public static void main(String[] args) {
		String n = "12345abcd123456";
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n.length(); i++) {
			if (Character.isAlphabetic(n.charAt(i)))
				sb.append(n.charAt(i));
		}
		System.out.println(sb);
	}

}
