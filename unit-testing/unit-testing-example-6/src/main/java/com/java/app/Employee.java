package com.java.app;

import java.util.Arrays;

public class Employee {

	public String[] addName() {
		String name[] = { "RK", "GS", "RS", "RKP" };
		System.out.println("Name of the employee's are:"
				+ Arrays.toString(name));
		return name;
	}

}
