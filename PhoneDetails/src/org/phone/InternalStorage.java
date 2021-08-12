package org.phone;

public class InternalStorage {
	public void processorname() {
		System.out.println("processor");
	}
public void ramSize() {
	System.out.println("ram size");
}

public static void main(String[] args) {
	ExternalStorage external=new ExternalStorage();
	InternalStorage internal=new InternalStorage();
	external.size();
	internal.processorname();
	internal.ramSize();
	
}
}
