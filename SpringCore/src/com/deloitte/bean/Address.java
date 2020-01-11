package com.deloitte.bean;

public class Address {
	private int houseNo;
	private String steet;
	private String city;
	private String state;
	public Address() {
		
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getSteet() {
		return steet;
	}
	public void setSteet(String steet) {
		this.steet = steet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int houseNo, String steet, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.steet = steet;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", steet=" + steet + ", city=" + city + ", state=" + state + "]";
	}
	

}
