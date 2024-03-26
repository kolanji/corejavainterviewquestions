package org.stringtestprogram;

public class PermutationofaString {
	public static void main(String args[]) {
		String input = "123";

		/* * A method exposed to client to calculate permutation of String in Java. */

		permutation(input, "");

	}

	private static void permutation(String perm, String space) {
		if (perm.isEmpty()) {
			System.err.println(perm + space);
		} else {
			for (int i = 0; i < perm.length(); i++) {

				char c = perm.charAt(i);
				String st = perm.substring(0, i) + perm.substring(i + 1);
				permutation(st, space + c);
			}
		}
	}

}