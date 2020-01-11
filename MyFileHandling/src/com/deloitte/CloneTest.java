package com.deloitte;

import com.deloitte.emp.Dept;
import com.deloitte.emp.Emp;

public class CloneTest{

	
	public CloneTest() {
		Emp emp = new Emp(111, "Mrunank", 9876543210L, "BTA", new Dept(988, "Sales"));
		try {
			Emp empClone = (Emp) emp.clone();
			System.out.println(empClone);
			System.out.println(emp == empClone);
			emp.getDept().setName("HR");
			System.out.println(empClone);
			//shallow cloning: the internal objects are not cloned
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CloneTest();

	}

}
