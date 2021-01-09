package com.javaPrograms;

public class PrimeNumber {

	public static void primeNumber(int number) {

		int count = 0;
		if (number > 1) {

			for (int i = 1; i <= number; i++) {
				if (number % i == 0)
					count++;
			}
			System.out.println("count is  " + count);
			if (count == 2) {
				System.out.println("given number is prime");
			} else {
				System.out.println("given number is not a prime number");
			}

		}

		else {
			System.out.println("not a prime number");
		}
	}

	public static void main(String[] args) {
		primeNumber(0);
	}

}
