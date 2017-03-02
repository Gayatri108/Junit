package com.test.java;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.java.app.Department;

import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;

/*This example implement the Rules using @Rule annotation.
 * This is a new feature of JUnit,
 * which allows very flexible addition or redefinition of the behavior of each test method in a test class.
 *@Rule annotation should be used to mark public fields of a test class. Those fields should be of type MethodRule,
 * which is an alteration in how a test method is run and reported. Multiple MethodRules can be applied to a test method.
 * In this example we use TestName, which makes the current test name available inside test methods*/

public class DepartmentTest {
	Department dept = new Department();
	String[] dept_name_1 = { "IT", "FINANCE", "HR" };
	String[] dept_name_2 = { "IT", "FINANCE", "HR", "Research" };
	@Rule
	public TestName testName = new TestName();

	@Test
	public final void testDisplayDept() {
		System.out.println("Inside: " + testName.getMethodName());
		assertArrayEquals(dept_name_1, dept.displayDept());

	}

	@Test
	public final void testAddDept() {
		System.out.println("Inside: " + testName.getMethodName());
		assertArrayEquals(dept_name_2, dept.addDept());
	}

}
