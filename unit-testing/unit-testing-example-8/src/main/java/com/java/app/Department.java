package com.java.app;

import java.util.Arrays;

public class Department {

	public String[] displayDept() {
		String[] deptName = { "IT", "FINANCE", "HR" };
		System.out.println("Dept names are: "

		+ Arrays.toString(deptName));
		return deptName;

	}

	public String[] addDept() {

		String[] deptName = { "IT", "FINANCE", "HR", "Research" };

		System.out.println("List contains: " + Arrays.toString(deptName));

		return deptName;

	}

}
