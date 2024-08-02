package com.indus.training.core.svc;

/**
 * AbstractCircle provides a base implementation for circle-related
 * calculations, such as perimeter. It also defines an abstract method for
 * calculating the area.
 */
public abstract class AbstractCircle implements ICircle {
	/**
	 * Calculates the perimeter
	 * 
	 * @param radius The radius of the circle.
	 * @return The perimeter of the circle.
	 */

	@Override
	public double perimeter(double radius) {
		double result = 0.0;
		{
			result = 2 * 3.14 * radius;

		}
		return result;
	}

	/**
	 * Abstract method to calculate the area of a circle. Implementing classes must
	 * provide the implementation for this method.
	 * 
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public abstract double area(double radius);
}
