package com.java.app;

/*Here Calculator class contains a public sum method which accepts two integer value and returns addition of two values
 * So in order to test this method we will create a test class.In this example we are creating it manually,
 * later point we can create using Junit test case or junit test suit*/

public class Calculator {
	public int sum(int i, int j) {
		System.out.println("Addition of two numbers" + i + "and " + j + " is");
		return i + j;
	}

}
