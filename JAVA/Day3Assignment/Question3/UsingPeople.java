package com.sonata.day3;

public class UsingPeople {

	public static void main(String[] args) {
		
		//Technical Employee 
		TechnicalEmployee t1 = new TechnicalEmployee(22806, "Syed Umar", "JAVA", 35000, 5);
		Address tAdd = new Address(48, "JC Nagar", "Bengaluru", 560006);
		t1.address = tAdd;
		
		//Staff
		Staff s1 = new Staff(12345, "Staff Name", "Staff Title", 12000, 2);
		Address sAdd = new Address(11, "N R Colony", "Bengaluru", 560035);
		s1.address = sAdd;
		
		//Display all details
		System.out.println(t1);
		System.out.println("\n\n" + s1);
	}
}