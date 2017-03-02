package com.test.app;

import static org.junit.Assert.*;
/*This is the test class of City.java*/

import org.junit.Test;

import com.java.app.City;

public class CityTest {
	City list = new City();
	String city[] = { "BLR", "HYB", "BBSR" };

	@Test
	public final void testAddCity() {
		System.out.println("Inside  testAddCity() method");
		assertArrayEquals(city, list.addCity());
	}

}
