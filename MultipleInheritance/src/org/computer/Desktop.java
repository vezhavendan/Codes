package org.computer;

public class Desktop implements Hardware,Software {

	@Override
	public void softwareResouces(String value) {
		System.out.println("configuration is "+value);
		
	}

	@Override
	public void hardwareResources(String value) {
		System.out.println("configuration is "+value);
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources("4gb DDR4");
		d.softwareResouces("WIndows 10");
	}

}
