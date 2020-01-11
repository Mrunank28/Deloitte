package com.deloitte;

public class Car extends Vehicle implements Movable{

	@Override
	public void move() {
		System.out.println("Car is moving");
		
	}
	
}
