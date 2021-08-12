package org.emp;

public class Employee {
  public void empid(int a,String value) {
	  System.out.println("number"+a+value);
	  }
  public void empid(String name) {
	  System.out.println("name"+name);
  }
  public static void main(String[] args) {
	Employee e=new Employee();
	e.empid(1456, "vezha vendan");
	e.empid("vezha");
}
}
