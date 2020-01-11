package com.deloitte;

public class Bus extends Vehicle implements Movable{

	@Override
	public void move() {
		System.out.println("Bus is moving");
		
	}
	
}
