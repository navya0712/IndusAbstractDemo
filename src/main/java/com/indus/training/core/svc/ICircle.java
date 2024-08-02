package com.indus.training.core.svc;

/**
 * The ICircle interface defines methods for calculating the perimeter and area
 * of a circle.
 */
public interface ICircle {

	/**
	 * Calculates the perimeter (circumference) of a circle.
	 * 
	 * @param radius The radius of the circle.
	 * @return The perimeter of the circle.
	 */
	public double perimeter(double radius);

	/**
	 * Calculates the area of a circle.
	 * 
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public double area(double radius);
}
