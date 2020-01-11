package com.deloitte;

import java.util.Comparator;

public class EmpComparator implements Comparator<Emp> {

	private OrderField orderField;

	EmpComparator(OrderField orderField) {
		this.orderField = orderField;
	}

	@Override
	public int compare(Emp e1, Emp e2) {
		if (orderField == OrderField.NAME)
			return e1.getName().compareTo(e2.getName());
		else if (orderField == OrderField.MOBILE)
			return (int) (e1.getMobile() - e2.getMobile());

		return e1.getId() - e2.getId();

	}

}
