package com.deloitte.emp;

import java.io.Serializable;

public class Emp implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private int Id;
	private String Name;
	private transient long Mobile; // transient means it cannot be saved in the file
	private String Designation;
	private Dept dept;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Emp clonedEmp = (Emp) super.clone();
		Dept dept = clonedEmp.getDept();
		
		Dept clonedDept = (Dept) dept.clone();
		clonedEmp.setDept(clonedDept);
		//deep cloning: all objects inside the objects also cloned
		return clonedEmp;
	}

	public Emp() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Emp(int id, String name, long mobile, String designation) {
		super();
		Id = id;
		Name = name;
		Mobile = mobile;
		Designation = designation;
	}

	public Emp(int id, String name, long mobile, String designation, Dept dept) {
		super();
		Id = id;
		Name = name;
		Mobile = mobile;
		Designation = designation;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [Id=" + Id + ", Name=" + Name + ", Designation=" + Designation + ", dept=" + dept + "]";
	}

}
