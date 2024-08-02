package com.indus.training.core.impl;

import com.indus.training.core.svc.AbstractCircle;

/**
 * The Circle class provides an implementation of the AbstractCircle class,
 * calculating the area of a circle based on a given radius.
 */
public class Circle extends AbstractCircle {

	/**
	 * Calculates the area of a circle 
	 * 
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	@Override
	public double area(double radius) {
		double result = 0.0;
		{
			result = 3.14 * radius * radius;

		}
		return result;
	}

}
