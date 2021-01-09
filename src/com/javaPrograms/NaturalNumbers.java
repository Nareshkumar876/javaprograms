package com.javaPrograms;

public class NaturalNumbers {
public static void naturalNum(int nums){
	int sum=0;	int naturamsum=0;
	for(int i=0;i<=nums;i++){
		sum=sum+i;
	}
	System.out.println("natural sum is "+sum);
	
}
public static void main(String[] args) {
	naturalNum(11);
}
}
