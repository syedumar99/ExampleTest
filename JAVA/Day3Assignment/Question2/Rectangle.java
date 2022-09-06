package com.sonata.day3;

public class Rectangle extends Shape {

	Rectangle() {}
	Rectangle(float l, float w) {
		super.length = l;
		super.width = w;

	}

	@Override
	public void draw() {

		System.out.println("A Rectangle...\n Drawing with Length - " + length + "cm and Width - " + width + "cm");

	}

	@Override
	public float calArea() {

		return length * width;

	}

	public String toString() {

		draw();
		return "Area of Rectangle - " + calArea() + "cm\n\n";

	}

}