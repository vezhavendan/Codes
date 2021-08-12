package org.network;

public class Wifi {
	public void wifiname() {
		System.out.println("wifiname");
	}

	public static void main(String[] args) {
		Wifi wifi=new Wifi();
		MoblieData data=new MoblieData();
		Lan lan=new Lan();
		Wireless wireless=new Wireless();
		wifi.wifiname();
		data.dataname();
		lan.lanname();
		wireless.modamname();
		
	}

}
