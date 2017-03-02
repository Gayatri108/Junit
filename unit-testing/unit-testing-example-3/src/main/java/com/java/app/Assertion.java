package com.java.app;

import static org.junit.Assert.*;
import org.junit.Test;

/*This example represents the basic assertion method present in junit4*/

public class Assertion {
	@Test
	public void Test() {
		String s1 = "junit";
		String s2 = "junit";
		String s3 = "test";
		String s4 = "test";
		String s5 = null;
		boolean var1 = true;
		int var2 = 20;
		int array1[] = { 11, 22, 33 };
		int array2[] = { 11, 22, 33 };
		/*
		 * assertEquals() method will return normally if the two compared
		 * objects are equal, else we will get failure in Junit window and the
		 * test will abort.
		 */
		assertEquals(s1, s2);
		/*
		 * The assertSame() and assertNotSame() methods tests if two object
		 * references point to exactly the same object.
		 */
		assertSame(s3, s4);
		assertNotSame(s1, s3);
		// assertNotSame(s1, s2);
		/*
		 * The assertNull() and assertNotNull() methods test whether a variable
		 * is null or not null.
		 */
		assertNull(s4);
		assertNull(s5);
		assertNotNull(s5);
		assertNotNull(s1);
		/*
		 * The assertTrue() and assertFalse() methods tests if a condition or a
		 * variable is true or false.
		 */
		assertTrue("True", var1);
		// assertFalse(var1);
		/*
		 * The assertArrayEquals() will compare the two arrays and if they are
		 * equal, the method will proceed without errors. else we will get
		 * failure in test window and the test will abort.
		 */
		assertArrayEquals(array1, array2);
		// assertTrue(var1);

	}

}
