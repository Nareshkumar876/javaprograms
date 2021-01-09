package com.javaPrograms;

public class ReverseNumber {

	public static void reverseNumber(int number) {

		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("rev number is "+rev);
	}

	public static void main(String[] args) {

		reverseNumber(1219);

	}

}
