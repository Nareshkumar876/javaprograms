package com.javaPrograms;

import java.util.Scanner;

public class Numberofdaysinamonth {

	public static void main(String[] args) {
		
		int no_ofdays=0;
		int year;
		String month;
		int monthnumber;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the month");
	monthnumber=sc.nextInt();
	
	System.out.println("enter the year");
	year=sc.nextInt();
	
	
		switch(monthnumber){
		case 1:
		no_ofdays=31;
		break;
		
		case 2:
			if(year%4==0){
			no_ofdays=29; } 
			else{
				no_ofdays=28;
				
			}
			break;
			
			
		case 3:
			no_ofdays=31;
			break;
			
			
		case 4:
			no_ofdays=30;
			break;
			
			
		case 5:
			no_ofdays=31;
			break;
			
			
		case 6:
			no_ofdays=30;
			break;
			
			
			
		case 7:
			no_ofdays=31;
			break;
			
			
			
		case 8:
			no_ofdays=31;
			break;
			
			
		case 9:
			no_ofdays=30;
			break;
			
			
		case 10:
			no_ofdays=31;
			break;
			
			
		case 11:
			no_ofdays=30;
			break;
			
			
		case 12:
			no_ofdays=31;
			break;
		
		}
		System.out.println("no of days in a month is "+no_ofdays);



	}

}
