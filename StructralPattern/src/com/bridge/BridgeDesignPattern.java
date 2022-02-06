package com.bridge;

import java.util.Scanner;

// https://www.youtube.com/watch?v=ztdhlaWL5S0&list=PLmCsXDGbJHdjoZ98R74y_nXfT60pOT2h4&index=7
public class BridgeDesignPattern {

	public static void main(String[] args) {

		System.out.println("Please enter the color you want to fill  : 'Green' or 'Blue'");
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		System.out.println("color : " + color);

		Shape rectangleShape = new Rectangle();
		rectangleShape.draw();

		Shape circleShape = new Circle();
		circleShape.draw();

		System.out.println();

		if ("blue".equalsIgnoreCase(color)) {
			rectangleShape.setColor(new BlueColorImplementor());
			rectangleShape.colorIt();

			circleShape.setColor(new BlueColorImplementor());
			circleShape.colorIt();
		} else if ("green".equalsIgnoreCase(color)) {
			rectangleShape.setColor(new GreenColorImplementor());
			rectangleShape.colorIt();

			circleShape.setColor(new GreenColorImplementor());
			circleShape.colorIt();
		}
	}

}
