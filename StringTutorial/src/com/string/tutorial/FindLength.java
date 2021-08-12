package com.string.tutorial;

public class FindLength {
	static String String1=" GreensTEchnology";
	String String2="SeleniumAutomationTool";
	String String3="Velmurugan";
	String String4="j a v a p r o g r a m";
	String String5="90954846789";
	
	public static void main(String[] args) {
		FindLength fl=new FindLength();
	String fl1= fl.String1;
	System.out.println("length of the string is: "+fl1.length());
	String fl2=fl.String2;
	System.out.println("Length if the string is: "+fl2.length());
	String fl3=fl.String3;
	System.out.println("length of the string is: "+fl3.length());
	String fl4=fl.String4;
	System.out.println("length of the string is: "+fl4.length());
	String fl5=fl.String5;
	System.out.println("length of the string is :"+fl5.length());
	
	System.out.println("-----------------------------------------");
	System.out.println("VALID MOBILE NUMBER");
	System.out.println("-----------------------------------------");
	
	int length=fl5.length();
	
	if (length>10) {
		System.out.println("invalid number");
		
	}else {
		System.out.println("valid nos");	}
	}
			

	
	

}
