package com.java.Test;

import static org.junit.Assert.assertEquals;
/*Example of parameterized test class*/

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.java.app.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTest {

	public TestName name = new TestName();

	private int result;
	private int first;
	private int second;

	public CalculatorTest(int result, int first, int second) {

		this.result = result;
		this.first = first;
		this.second = second;
	}

	@Parameters
	public static Collection addNumber() {
		Integer[][] a = new Integer[][] { { 1, 0, 1 }, { 6, 4, 2 },
				{ 16, 10, 6 } };

		return Arrays.asList(a);

	}

	@Test
	public final void testSum() {
		Calculator cal = new Calculator();
		System.out.print("Addition of " + first + " and " + second + "  is: ");
		assertEquals(result, cal.sum(first, second));

	}

}
