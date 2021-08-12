package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void TransportForm() {
		System.out.println("Transport Form");
	}
	public static void main(String[] args) {
		Transport transport=new Transport();
		Road road=new Road();
		Air air=new Air();
		Water water=new Water();
		 transport.TransportForm();
		 road.bike();
		 road.bus();
		 road.car();
		 road.cycle();
		 air.aeroplane();
		 air.helicopter();
		 water.boat();
		 water.ship();
		 
	}

	

}
