package com.test.java;

import static org.junit.Assert.assertEquals;
/*This example shows the use of @Ignore annotation of test
 * In the test class CalulatorTest we will add the @Ignore annotation to the testSub() method.
 *  In this way, we expect that this testing method will be ignored and won’t be executed.*/

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.java.app.Calculator;

public class CalculatorTest {
	Calculator cal = new Calculator();

	@Test
	public final void testAdd() {
		System.out.println("Inside add Test");
		assertEquals(10, cal.add(5, 5));
	}

	@Ignore
	@Test
	public final void testSub() {
		System.out.println("Inside sub test");
		assertEquals(15, cal.sub(45, 30));

	}

	@Test
	public final void testMul() {
		System.out.println("Inside mul test");
		assertEquals(25, cal.mul(5, 5));
	}

	@Test
	public final void testDiv() {
		System.out.println("Inside Div Test");
		assertEquals(5, cal.div(15, 3));
	}

}
