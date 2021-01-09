package com.javaPrograms;

public class Employee {
	String name;
	String address;
	public void accept() {
		name = "ravi";
		address = "bengaluru";
	}
	
	public void display() {
		System.out.println(name + "," + address);
	}
	
	public static void main(String[] args) {
		Employee obj = new Employee(); //default constructor
		//obj.accept();
		obj.display();
	}

}
