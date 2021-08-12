package org.marks;

import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String studentid=scanner.nextLine();
		System.out.println("Studend id is:"+studentid);
		String name=scanner.nextLine();
		System.out.println("name is:"+name);
		float mark1=scanner.nextFloat();
		System.out.println("mark1 is:"+mark1);
		float mark2=scanner.nextFloat();
		System.out.println("mark2 is:"+mark2);
		float mark3=scanner.nextFloat();
		System.out.println("mark3 is:"+mark3);
		float mark4=scanner.nextFloat();
		System.out.println("mark4 is:"+mark4);
		float mark5=scanner.nextFloat();
		System.out.println("mark5 is:"+mark5);
		 float total=mark1+mark2+mark3+mark4+mark5;
		 System.out.println("total marks is"+total);
        float average=total/5;
        System.out.println("average marks is"+average);
	}

}
