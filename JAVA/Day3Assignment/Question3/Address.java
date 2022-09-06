package com.sonata.day3;

public class Address {

	int doorNo,pinCode;
	String street,city;
	Address () {}
	Address (int door , String street , String city , int pincode) {

		this.doorNo = door;
		this.street = street;
		this.city = city;
		this.pinCode = pincode;

	}

	public String toString() {

		return doorNo+", "+street+", "+city+" - "+pinCode;

	}

}