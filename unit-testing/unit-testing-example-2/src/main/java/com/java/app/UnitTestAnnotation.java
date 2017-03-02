package com.java.app;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
/*This example indicates the basic annotation supported in junit4*/

public class UnitTestAnnotation {
	private ArrayList arraylist=null;
	
	/*The BeforeClass annotation indicates that the static method to
	 *which is attached must be executed once and before all tests in the class*/ 
	@BeforeClass
	public static void oncebeforeAllTestExecute()
	{
		System.out.println("@Before class: onceBeforeAllTestExecute");
	}
	/*The Before annotation indicates that this method must be executed before each test in the class*/ 
	
	@Before
	public void beforeEachTestExecute()
	{
		arraylist=new ArrayList<String>();
		
		System.out.println("@Before: beforeEachTestExecute");
		System.out.println("creates an empty array list");
	}
	/*The After annotation indicates that this method gets executed after execution of each test*/ 
	 @After
	   public void afterEachTestExecute()
	   {
		   arraylist.clear();
		   
		   System.out.println("@After : afterEachTestExecute");
		   
		   System.out.println("clear the elements from array list");
	   }
	 /*The AfterClass annotation can be used when a method needs to be executed
	  *  after executing all the tests in a JUnit Test Case class*/
	   @AfterClass
	   public static void onceAfterAllTestExecute()
	   {
		   System.out.println("@AfterClass :afterAllTestExecute");
	   }
	   /*The Test annotation indicates that the
	   public void method to which it is attached can be run as a test case.*/
	@Test
	public void collectionEmpty()
	{
		assertTrue(arraylist.isEmpty());
		System.out.println("@Test :arrayListEmpty()");
	}
	@Test
	public void addElement()
	{
		arraylist.add("RK");
		assertEquals(1, arraylist.size());
		arraylist.add("GS");
		assertEquals(2, arraylist.size());
		System.out.println("@Test :addElement");
		System.out.println(arraylist);
	}
	/*The Ignore annotation 
	can be used when you want temporarily disable the execution of a specific test.*/
  
   @Ignore
   public void ignoreTest()
   {
	   System.out.println("ignoreTest");
   }
}
