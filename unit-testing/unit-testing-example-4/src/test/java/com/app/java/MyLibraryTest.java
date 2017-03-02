package com.app.java;

import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;

/*This is test class of MyLibrary.java,To create this we have to right click on the package and select New → JUnit Test Case
 * Then change the source folder so that we can specify the test class in test source folder.
 * Make the flag new Junit4 test is selected 
 * Then click finish
 * Ensure you have added the JUnit library to your class else we will get error
 * After creation of your test class(i.e MyLibraryTest),you can write your test plan as per your requirement and 
 * Now we can run the test case by right-clicking on the test class and select Run As -> JUnit Test.We will get
 * the output
 *inside testBookList()
 List of books are: [Java, Sql, AngularJs]

 Inside testAddBook()
 List contains: [Java, Sql, AngularJs, Hadoop]
 and the and in the JUnit view will be no failures or erros, 
 If we change one of the arrays, so that it contains more than the expected elements:
 String[] myBookList_2 = { "Java", "Sql", "AngularJs", "Hadoop",HTML } and we run again the test class,
 the JUnit view will contain a failure:;
 */

public class MyLibraryTest extends TestCase {
	MyLibrary myLib = new MyLibrary();
	String[] myBookList_1 = { "Java", "Sql", "AngularJs" };
	String[] myBookList_2 = { "Java", "Sql", "AngularJs", "Hadoop" };

	// String[] myBookList_2 = { "Java", "Sql", "AngularJs", "Hadoop","HTML" };

	public final void testBookList() {
		System.out.println("inside testBookList()");
		assertArrayEquals(myBookList_1, myLib.bookList());
		System.out.println();
	}

	public final void testAddBook() {
		System.out.println("Inside testAddBook()");
		assertArrayEquals(myBookList_2, myLib.addBook());
	}

}
