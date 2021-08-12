package org.phone;



public class PhoneInfo {
	public void phoneName() {
		System.out.println("phonenamw");
	}
	public void phoneImeiNum() {
		System.out.println("Imei nos");
	}
	public void Camera() {
		System.out.println("camera");
	}
public void storage() {
	System.out.println("storage");
}
public void osName() {
	System.out.println("osname");
}

	public static void main(String[] args) {
		PhoneInfo phone=new PhoneInfo();
		phone.phoneName();
		phone.phoneImeiNum();
		phone.Camera();
		phone.storage();
		phone.osName();
		// TODO Auto-generated method stub

	}
}


