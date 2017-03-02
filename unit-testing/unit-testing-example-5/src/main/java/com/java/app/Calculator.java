package com.java.app;

public class Calculator {
	public int add(int number1, int number2) {
		int c = number1 + number2;
		System.out.println("addition of two numbers:" + c);
		return c;
	}

	public int sub(int number1, int number2) {
		int c = number1 - number2;
		System.out.println("Substraction of two numbers:" + c);
		return c;
	}

	public int mul(int number1, int number2) {
		int c = number1 * number2;
		System.out.println("Multipliaction of two numbers:" + c);
		return c;
	}

	public int div(int number1, int number2) {

		int c = number1 / number2;
		System.out.println("Division of two numbers:" + c);
		return c;
	}

}
