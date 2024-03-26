package org.algorithmtestprogram;

import java.io.InputStream;
import java.util.stream.IntStream;

public class PrimeChecker {
	public static boolean isprime(int number) {

		return IntStream.rangeClosed(2, number/2)
				.noneMatch(i -> number%i == 0);
	}

	public static void main(String[] args) {
		boolean checkPrime = PrimeChecker.isprime(6);
		System.out.println("Prime number{}:"+checkPrime);
	}

}
