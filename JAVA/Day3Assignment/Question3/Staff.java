package com.sonata.day3;

public class Staff extends Employee {

	double salary, HRA;
	String title;
	Staff() {}
	Staff(int id, String name, String title, double bPay, int nLeaves) {

		super.empId = id;
		super.empName = name;
		this.title = title;
		super.basicPay = bPay;
		super.numofLeaves = nLeaves;

	}

	public double calcHRA() {

		HRA = 0.18 * basicPay;
		return HRA;

	}

	@Override
	public double calculateSalary() {

		salary = basicPay + HRA;
		return salary;

	}

	public String toString() {

		return "Staff Details\n\nID - " + empId + "\nName - " + empName + "\nTitle - " + title + "\nAddress - " + address + "\nBasic Pay - " + basicPay + "\nHRA - " + calcHRA() + "\nSalary - " + calculateSalary();

	}
}