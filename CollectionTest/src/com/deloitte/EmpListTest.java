package com.deloitte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpListTest {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(141, "Swati", 26564432566L));
		empList.add(new Emp(112, "Adsz", 86564432566L));
		empList.add(new Emp(152, "Farop", 96564432566L));
		empList.add(new Emp(132, "Mdfi", 56564432566L));
		System.out.println("Sort by Id");
		Collections.sort(empList, new EmpComparator(OrderField.ID));
		System.out.println(empList);
		System.out.println("Sort by Name");
		//Collections.sort(empList, new EmpComparator(OrderField.NAME));
		Collections.sort(empList, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println(empList);
		System.out.println("Sort by Mobile");
		Collections.sort(empList, new EmpComparator(OrderField.MOBILE));
		System.out.println(empList);
		
	}

}
