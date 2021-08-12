package com.string.tutorial;

public class CharacterIndexTutorial extends FindLength {
	
	public static void main(String[] args) {
		CharacterIndexTutorial ci=new CharacterIndexTutorial();

	String ci1=ci.String1;
	
	System.out.println("-----------------------------------------");
	System.out.println("FIND INDEX OF CHARACTERS");
	System.out.println("-----------------------------------------");
	
	System.out.println("character index of o is: "+ci1.lastIndexOf("o"));
	String ci2=ci.String2;
	System.out.println("charaacter  index of o is: "+ci2.indexOf('o'));
	String ci3=ci.String3;
	System.out.println("character index of n is: "+ci3.indexOf('n'));
	String ci4=ci.String4;
	System.out.println("last index of empty space is: "+ci4.lastIndexOf(" "));
	String ci5=ci.String5;
	System.out.println("index  of 8 is: "+ci5.indexOf('8'));
	
	System.out.println("-----------------------------------------");
	System.out.println("FIND CHARACTER");
	System.out.println("-----------------------------------------");
	
	
	System.out.println("Character h is present: "+ci1.contains("h"));
	System.out.println("Character o is present: "+ci2.contains("o"));
	System.out.println("character u is present: "+ci3.contains("u"));
	System.out.println("character p is present: "+ci4.contains("p"));
	System.out.println("character 7 is present: "+ci5.contains("7"));
	
	System.out.println("-----------------------------------------");
	System.out.println("VALID EMAIL ID");
	System.out.println("-----------------------------------------");
	
	String email="velmurugank451@gmail.com";
	System.out.println("@ is present: "+email.contains("@"));
	if(email.contains("@")) {
		System.out.println("valid email id");
	}else {
		System.out.println("invalid email id");
	}
	System.out.println("-----------------------------------------");
	System.out.println("VERIFY ADDRESS");
	System.out.println("-----------------------------------------");
	String address="5-35-2a,venkatesh nivas,aruppukottai";
	if (address.contains("pincode")) {
		System.out.println("valid address");
		}else {
			System.out.println("invalid address");
		}
	
	
	
	
	
	
	}

}
