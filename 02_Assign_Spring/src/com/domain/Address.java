package com.domain;

public class Address {

	private String city,state,pincode;

	public Address() {
		super();
		this.city = "Datia";
		this.state = "Madhya Pradesh";
		this.pincode = "475661";
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
}
