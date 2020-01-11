package com.deloitte;

import java.util.HashSet;
import java.util.Set;

public class EmpSetTest {

	public static void main(String[] args) {
		Set<Emp2> empSet = new HashSet<>();
		empSet.add(new Emp2(141,"Priya",9012341234L));
		empSet.add(new Emp2(111,"Swati",9011223344L));
		empSet.add(new Emp2(231,"Arya",8011223122L));
		empSet.add(new Emp2(199,"Deepika",9012111239L));
		empSet.add(new Emp2(871,"Reshma",8011001223L));
		empSet.add(new Emp2(141,"Priya",9012341234L));
		System.out.println(empSet);
	}
	

}
