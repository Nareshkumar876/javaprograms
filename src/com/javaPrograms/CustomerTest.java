package com.javaPrograms;

public class CustomerTest {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void accept() {
		setName("naresh	");
		setAddress("hyd");
	}
	
	public void display() {
		System.out.println(getName() + "," + getAddress());
	}
	
	public static void main(String[] args) {
		CustomerTest obj = new CustomerTest();
		obj.accept();
		obj.display();
	}
}
