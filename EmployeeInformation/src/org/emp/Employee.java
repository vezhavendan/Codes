package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empname() {
		System.out.println("empployee name");
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		Company company=new Company();
		Client client=new Client();
		Project project=new Project();
		
		employee.empname();
		company.companyname();
		client.clientname();
		project.projectname();
	}

}
