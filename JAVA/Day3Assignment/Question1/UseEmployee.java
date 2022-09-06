package com.sonata.day3;

public class UseEmployee {

	public static void main(String[] args) {

		Manager m1 = new Manager(22888, "Manager ", 900);
		Developer d1 = new Developer(22806, "Umar", 600);
		Tester t1 = new Tester(54321, "Touheed", 400);
		m1.display();
		d1.display();
		t1.display();

	}

}