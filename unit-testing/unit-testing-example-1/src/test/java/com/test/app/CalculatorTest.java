package com.test.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.app.Calculator;

public class CalculatorTest {

	Calculator calculate = new Calculator();
	int sum = calculate.sum(10, 20);
	int result = 30;

	// int result=40;
	/*
	 * @Test annotation indicates that the public method to which it is attached
	 * can be run as Test case.Hence testSum() tests the public sum()
	 */
	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + result);
		/*
		 * assertEquals takes two objects and asserts both are equal or not. If
		 * equal the test is successful else unsuccessful, and will get the
		 * error.In example if we comment line 15,then test is successful. and
		 * if we don't comment line 15 and comment line 14, test will
		 * unsuccessful and will get the error as follows:
		 * java.lang.AssertionError: expected:<30> but was:<40>
		 */
		assertEquals(result, sum);

	}

}
