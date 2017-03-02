package com.test.app;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*Here we create suite tests.
 * A test suite is a collection of some test cases from different classes that can be run all together
 * using @RunWith and @Suite annotations.This is very helpful if you have many test classes and
 * you want to run them all together instead of running each test one at a time.
 * To implement this we have created two test classes.
 * The one class will test the public method addCity() and the other test class will test the method addName(). 
 *Now we will create a test suite so as to run the above classes together. 
 *Right-click test source folder and select New → JUnit Test suite,Specify your suite name,then click on finish
 *if you right-click the test suite and select Run As -> JUnit Test, 
 *the execution of both test classes will take place with the order that has been defined in the @Suite.SuiteClasses annotation.*/

@RunWith(Suite.class)
/*
 * With the @Suite.SuiteClasses annotation you can define which test classes
 * will be included in the execution.
 */
@SuiteClasses({ CityTest.class, EmployeeTest.class })
public class AllTests {

}
