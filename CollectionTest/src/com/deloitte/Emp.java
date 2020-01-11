package com.deloitte;

public class Emp {
	private int id;
	private String name;
	private long mobile;
	private String delim = System.getProperty("line.separator");

	public Emp() {
	}

	public Emp(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return delim +"Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
}
