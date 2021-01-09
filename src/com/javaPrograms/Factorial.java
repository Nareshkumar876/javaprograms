package com.javaPrograms;

public class Factorial {

	public static void main(String[] args) {

int num=6;
long fact=1;

for(int i=num;i>0;i--){
	fact=fact*i;
	
}
System.out.println("factorial of given number is "+fact);
int count=0;
if(fact>1){
	for(int i=1;i<=fact;i++){
		count++;
	}
	if(count==2){
		System.out.println("given number is prime");
	}
	else{
		System.out.println("given number is not prime");
	}
	
}
else{
	System.out.println("not prime number ");
}

	}

}
