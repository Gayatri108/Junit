package com.app.java;

import java.util.Arrays;

/*This is the java class which we will test*/

public class MyLibrary {
	public String[] bookList() {
		String[] bookList = { "Java", "Sql", "AngularJs" };

		System.out.println("List of books are: "

		+ Arrays.toString(bookList));

		return bookList;

	}

	public String[] addBook() {

		String[] bookList = { "Java", "Sql", "AngularJs", "Hadoop" };

		System.out.println("List contains: " + Arrays.toString(bookList));

		return bookList;

	}

}
