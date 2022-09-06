package com.sonata.day2;

public class StudentClass {
	
	int stdID, stdClass;
	
	String stdName;
	
	StudentClass(int id, String name, int cls) {
		
		this.stdID = id;
		this.stdName = name;
		this.stdClass = cls;
		
	}

	public static void main(String[] args) {
		
		StudentClass s1 = new StudentClass (101, "Syed Umar", 10);
		
		StudentClass s2 = new StudentClass (102 , "Syed" , 10 );
		
		System.out.println( "Student ID - " + s1.stdID + "\nStudent Name - " + s1.stdName + "\nStudent Class - " + s1.stdClass );
		System.out.println( "Student ID - " + s2.stdID + "\nStudent Name - " + s2.stdName + "\nStudent Class - " + s2.stdClass );
		
	}

}
