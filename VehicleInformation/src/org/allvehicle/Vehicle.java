package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void vehiclenecessery() {
		System.out.println("vehiclenecessery");
		
	}
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		TwoWheeler twowheeler=new TwoWheeler();
		ThreeWheeler threeWheeler=new ThreeWheeler();
		FourWheeler fourwheeler=new FourWheeler();
		
		vehicle.vehiclenecessery();
		twowheeler.bike();
		twowheeler.cycle();
		threeWheeler.auto();
		fourwheeler.bus();
		fourwheeler.car();
		fourwheeler.lorry();
		
	}

}
