package com.javaPrograms;

import java.util.Scanner;

public class NcrProgram {
	static int nCr(int n, int r)
	{
	    return fact(n) / (fact(r) *  fact(n - r));
	}
	static int fact(int n)
	{
	    int result = 1;
	           for (int i = 2; i <= n; i++)
	           result = result * i;
	          return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and r values : ");
		int n=sc.nextInt();
		int r =sc.nextInt();
		System.out.println("value of " + n + "C"+r+"="+nCr(n,r));
	}
}
