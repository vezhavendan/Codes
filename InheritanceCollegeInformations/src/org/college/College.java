package org.college;

public class College extends Student {
	public void collegename() {
		 System.out.println("collegename");
		}
	public void collegecode() {
		 System.out.println("college code");
		}
	public void collegeremk() {
		 System.out.println("rank");
		}
public static void main(String[] args) {
	College c=new College();
	c.collegename();
	c.collegecode();
	c.collegeremk();
	c.studentdept();
	c.studentid();
	c.studentname();
	c.hostelname();
	c.deptname();
	
	
}
}
