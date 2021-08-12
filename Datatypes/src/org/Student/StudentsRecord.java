package org.Student;

import java.util.Scanner;

public class StudentsRecord {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		 String empid=scanner.nextLine();
		 System.out.println("Employee id is: "+empid);
		 String empname=scanner.nextLine();
		 System.out.println("Employee name is: "+empname);
		 String empemail=scanner.nextLine();
		 System.out.println("Employee email is: "+empemail);
		 int empphoneno=scanner.nextInt();
		 System.out.println("Employee phonenos is: "+empphoneno);
		 int empsalery=scanner.nextInt();
		 System.out.println("Employee salery is: "+empsalery);
		 Thread.sleep(1000);
		 String empgender=scanner.next();
		 System.out.println("Employee gender is: "+empgender);
		 
		 String empcity=scanner.next();			
		 System.out.println("Employee city is: "+empcity);
		 
		 
	}

}
