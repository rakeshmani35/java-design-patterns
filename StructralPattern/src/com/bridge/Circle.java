package com.bridge;

public class Circle extends Shape {

	@Override
	public void colorIt() {
		System.out.print("Circle filled with ");
		color.fillColor();
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn........ with out any color");
	}

}
