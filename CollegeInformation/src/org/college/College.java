package org.college;

public class College {
	public void Collegename() {
		System.out.println("Collegename");
	}
	public void Collegecode() {
		System.out.println("Collegecode");
	}
	public void Collegerank() {
		System.out.println("Collegerank");
	}
	public static void main(String[] args) {
		College college=new College();
		Student student=new Student();
		Hostel hostel=new Hostel();
		Dept dept=new Dept();
		
		college.Collegecode();
		college.Collegename();
		college.Collegerank();
		student.studentdept();
		student.studentId();
		student.Studentname();
		hostel.hostelname();
		dept.deptname();
		
		
	}

}
