package com.javaPrograms;

import java.util.Scanner;

public class Numberofdaysinamonthusingstring {

	public static void main(String[] args) {
		
		int no_ofdays=0;
		int year;
		String month;
		int monthnumber;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the month");
		month=sc.nextLine();
	
	System.out.println("enter the year");
	year=sc.nextInt();
	
	
		switch(month){
		case "Jan":
		no_ofdays=31;
		break;
		
		case "Feb":
			if(year%4==0){
			no_ofdays=29; } 
			else{
				no_ofdays=28;
				
			}
			break;
			
			
		case "Mar":
			no_ofdays=31;
			break;
			
			
		case "Apr":
			no_ofdays=30;
			break;
			
			
		case "May":
			no_ofdays=31;
			break;
			
			
		case "June":
			no_ofdays=30;
			break;
			
			
			
		case "July":
			no_ofdays=31;
			break;
			
			
			
		case "Aug":
			no_ofdays=31;
			break;
			
			
		case "Sep":
			no_ofdays=30;
			break;
			
			
		case "Oct":
			no_ofdays=31;
			break;
			
			
		case "Nov":
			no_ofdays=30;
			break;
			
			
		case "Dec":
			no_ofdays=31;
			break;
		
		}
		System.out.println("no of days in a month is "+no_ofdays);



	}

}
