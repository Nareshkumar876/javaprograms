package com.javaPrograms;

public class MathematicalTable {

	public static void mathematicalTable(int num) {
		for (int i = 1; i <= 10; i++) {

			String naum = num + " * " + i + " = " + num * i;
			// String naum=num+"+ *+ "+ i+ "+ = +"+num*i;
			System.out.println(naum);

		}
	}

	public static void main(String[] args) {
		mathematicalTable(8);

	}

}
