package com.javaPrograms;

import java.util.Arrays;

public class StringProgram {
	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Hello";
		String str1 = new String("Hello");
		
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));
		System.out.println(str.contains("e"));
		System.out.println(str.substring(2,5));
		System.out.println(str.indexOf("o"));
       System.out.println(str == str2);
       System.out.println(str.equals(str1));
       String str3 = "   Hello   world   ";
       System.out.println(str3.trim());
       str = str.replace("e", "i");
       System.out.println(str);
       String dt = "12-jan-2020";
       String d[] = dt.split("-");
       for(String x : d)
    	   System.out.println(x);
       String str5 = "stackroute-program/ust/global";
       String d1[] = str5.split("[-/]");
       for(String x : d1)
    	   System.out.println(x);
	
	System.out.println(Arrays.toString(d1));
	
	
	String str6 = "1234";
	System.out.println(str6.matches("\\d+"));
	
	char[] cArr = str2.toCharArray();
	System.out.println(cArr.length);
	System.out.println(Arrays.toString(cArr));
	
	String panNo = "ABCD2456C";
	String regex = "[A-Z]{4}\\d{4}[A-Z]";
	System.out.println(panNo.matches(regex));
	
	
	String s = "Good Day";
	//Convert String into StringBuilder
	StringBuilder sb = new StringBuilder(s);
	//Mutable
	sb.append(" Folks");
	System.out.println(sb);
	sb.insert(0, "Hi , ");
	System.out.println(sb);
	sb.deleteCharAt(sb.length() -1);
	System.out.println(sb);
	System.out.println(sb.reverse());
	sb.setCharAt(0, 'B');
	System.out.println(sb);
	//Converting StringBuilder in to String
	String s1 = sb.toString();
	System.out.println(s1);
}
}