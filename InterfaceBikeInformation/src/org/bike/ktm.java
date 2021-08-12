package org.bike;

public class ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("cost of the bike is");
		
		
		
	}


	
	public static void main(String[] args) {
		ktm k=new ktm();
		k.cost();
		k.speed();
	}



	@Override
	public void speed() {
		System.out.println("speed is");
		
	}
	}
	