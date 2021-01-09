package com.javaPrograms;

public class Polindrome {

	public static void checkPolindrome(int number) {

		int orgnum = number;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);
		System.out.println(orgnum);

		if (orgnum == rev) {
			System.out.println("given number is polindrome");

		} else {
			System.out.println("given number is not polindrome");
		}
	}

	public static void main(String[] args) {

		checkPolindrome(121);

	}

}
