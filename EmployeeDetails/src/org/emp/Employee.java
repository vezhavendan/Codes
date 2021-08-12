package org.emp;

public class Employee {
	public void  empID() {
		System.out.println(" Emp ID is: 123456");
	}
public void empName() {
	System.out.println("Emp name is :xxxx");
}
public void empDob() {
	System.out.println("Emp dod is:dd/mm/yyyy");
	}
public void empPhone() {
	System.out.println("Emp Phone Nos:+91-xxxxxxx");
	}
public void empEmail() {
	System.out.println("Emp Email is:abc@gmail.com");
	}
public void empAddress() {
	System.out.println("Emp Address is:xxxxxxxxx");
	}
public static void main(String[] args) {
Employee employee=new Employee();
employee.empName();
employee.empID();
employee.empDob();
employee.empEmail();
employee.empPhone();
employee.empAddress();
}

	
		// TODO Auto-generated method stub



}
