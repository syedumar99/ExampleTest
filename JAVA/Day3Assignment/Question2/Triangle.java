package com.sonata.day3;

public class Triangle extends Shape {

	Triangle() {}
	Triangle(float h, float b) {
		super.height = h;
		super.base = b;

	}

	@Override
	public void draw() {

		System.out.println("A Triangle...\nDrawing with Height - " + height + "cm and Base - " + base + "cm");

	}

	@Override
	public float calArea() {

		return (height * base)/2;

	}

	public String toString() {

		draw();
		return "Area of Triangle - " + calArea() + "cm\n\n";

	}

}