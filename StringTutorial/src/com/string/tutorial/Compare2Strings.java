package com.string.tutorial;

import java.util.Scanner;

public class Compare2Strings {
	static String s1="Java";
	static String s2="Java";
	static String s3="java";
	static String s4="Green TEchnology";
	static String s5="GreenTechnology";
	static String s6="Nisha";
	static String s7="nisha";
	static String s8="Welcome to java class";
	
	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("COMPARE 2 STRINGS");
		System.out.println("-----------------------------------------");
		System.out.println("s1 and s2 string is equal: "+s1.equals(s2));
		System.out.println("s1 and s3 string is equal: "+s1.equals(s3));
		System.out.println("s4 and s5 string is equal: "+s4.equals(s5));
		System.out.println("s1 and s3 string is equalignorecases: "+s1.equalsIgnoreCase(s3));
		System.out.println("s6 and s7 string is equalignorecases: "+s6.equalsIgnoreCase(s7));
		System.out.println("s1 and s3 string is compare: "+s1.compareTo(s3));
		
		System.out.println("-----------------------------------------");
		System.out.println("REPLACE STRINGS");
		System.out.println("-----------------------------------------");
		
		System.out.println("replace java wit sql: "+s8.replace("java", "sql"));
		System.out.println("replace space into #: "+s8.replace(" ", "#"));
		
		System.out.println("-----------------------------------------");
		System.out.println("VERIFY AND REPLACE STRINGS");
		System.out.println("-----------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		String emailid=sc.next();
		System.out.println("Enter Email id: "+emailid);
		if (emailid.contains("gmail")) {
			String NewEmailid=emailid.replace("gmail", "yahoo");
			System.out.println("New Email ID is: "+NewEmailid);
			
		}else {
			System.out.println("i does not contains gmail in given address");
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("LOWER CASE TO UPPER CASE");
		System.out.println("-----------------------------------------");
		 System.out.println("converted text is: "+s7.toUpperCase());
		 System.out.println("converted text is: "+s6.toLowerCase());
		 System.out.println("-----------------------------------------");
			System.out.println("STARTS WITH & ENDS WITH");
			System.out.println("-----------------------------------------");
			System.out.println("starts with Welcome: "+s8.startsWith("Welcome"));
			System.out.println("starts with welcome: "+s8.startsWith("welcome"));
			System.out.println("ENDS WITH class: "+s8.endsWith("class"));
			System.out.println("ENDS WITH Class: "+s8.endsWith("Class"));
			
			 System.out.println("-----------------------------------------");
				System.out.println("SPLIT");
				System.out.println("-----------------------------------------");
			String[] split=	s8.split(" ");
			System.out.println("splitted text is: "+split[1]);
			String[] split1=s8.split("l");
			System.out.println("splitted text is: "+split1[0]);
			for (int i = 0; i < split.length; i++) {
				System.out.println(split[i]);
			}
				
			 System.out.println("-----------------------------------------");
				System.out.println("SUBSTRING & TRIM");
				System.out.println("-----------------------------------------");
				System.out.println("substring of: "+s8.substring(1));
				System.out.println("substring of: "+s8.substring(2, 11));
				System.out.println("Trim: "+s8.trim());
				
			}
			
		
	
		
	}
	


