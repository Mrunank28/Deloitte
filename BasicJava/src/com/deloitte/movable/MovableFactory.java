package com.deloitte.movable;

import com.deloitte.Bus;
import com.deloitte.Car;
import com.deloitte.Movable;
import com.deloitte.Van;

//Implements design pattern called factory pattern
public class MovableFactory {

	// called factory method
	public static Movable getInstance(String type) {
		Movable m = null;
		type = type.toLowerCase();
		switch (type) {
		case "car":
			m = new Car();
			break;

		case "bus":
			m = new Bus();
			break;

		case "van":
			m = new Van();

			break;

		default:
			//m = new UnknownVehicle();
			//local, inner, anonymous class
			m = new Movable() {
				
				@Override
				public void move() {
					System.out.println("Anonymous vehicle moving");
					
				}
			};
			break;
		}
		return m;
	}

	private static class UnknownVehicle implements Movable {

		@Override
		public void move() {
			System.out.println("Unknown Vehicle moving");

		}
	}
}