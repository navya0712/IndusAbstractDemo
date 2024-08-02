package com.indus.training.core.svc;

import com.indus.training.core.impl.Circle;

import junit.framework.TestCase;

/**
 * Provides test cases for the Circle class.
 */
public class TestCircle extends TestCase {

	private Circle circleObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		circleObj = new Circle();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		circleObj = null;
	}

	/**
	 * Test case for the area method
	 */
	public void testArea() {

		// 1. Inputs
		double radius = 1.0;

		// 2. Expected Results
		double expResult = 3.14;

		// 3. Actual Result
		double actResult = circleObj.area(radius);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);

	}

	/**
	 * Test case for the perimeter method
	 */
	public void testPerimeter() {

		// 1. Inputs
		double radius = 1.0;

		// 2. Expected Results
		double expResult = 3.14;

		// 3. Actual Result
		double actResult = circleObj.perimeter(radius);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

}
