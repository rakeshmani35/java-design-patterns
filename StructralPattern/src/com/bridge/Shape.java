package com.bridge;

/**
 * This interface act as a bridge between abstraction(ColorImplementor) and
 * implementation(Rectangle and Circle). Any changes in ColorImplementor does
 * not affect the Shape.
 * 
 * @author rakes
 *
 */
public abstract class Shape {

	public abstract void colorIt();

	abstract public void draw();

	protected ColorImplementor color;

	protected ColorImplementor getColor() {
		return color;
	}

	protected void setColor(ColorImplementor color) {
		this.color = color;
	}
}
