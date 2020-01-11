package com.deloitte;

public class Van extends Vehicle implements Movable{

	@Override
	public void move() {
		System.out.println("Van is moving");
		
	}

}
