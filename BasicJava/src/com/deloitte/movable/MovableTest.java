package com.deloitte.movable;

import java.util.Scanner;

import com.deloitte.Movable;

public class MovableTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle name");
		String type = scan.nextLine();
		
		Movable m = MovableFactory.getInstance(type);
		if(m != null) {
		m.move();
		}
		else {
			System.out.println(type + " not found");
		}
	}

}
