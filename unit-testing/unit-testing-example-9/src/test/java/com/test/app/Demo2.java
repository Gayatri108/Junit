package com.test.app;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

import com.java.app.Calculator;

@Category({ Slow.class, Fast.class })
public class Demo2 {
	Calculator cal = new Calculator();
	@Rule
	public TestName test = new TestName();

	@Test
	public final void testMul() {
		System.out.println("Inside: " + test.getMethodName());
		assertEquals(25, cal.mul(5, 5));

	}

	@Test
	public final void testDiv() {
		System.out.println("Inside: " + test.getMethodName());
		assertEquals(5, cal.div(25, 5));
	}

}
