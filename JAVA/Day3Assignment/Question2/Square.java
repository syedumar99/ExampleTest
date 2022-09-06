package com.sonata.day3;

public class Square extends Shape {

	Square() {}
	Square(float s) {

		super.side = s;

	}

	@Override
	public void draw() {

		System.out.println("A Square...\nDrawing with Side - " + side + "cm");

	}

	@Override
	public float calArea() {

		return side * side;

	}

	public String toString() {

		draw();
		return "Area of Square - " + calArea() + "cm\n\n";

	}

}