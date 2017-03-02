package com.test.app;

import org.junit.experimental.categories.Categories;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.java.app.Calculator;

/*JUnit has a new feature called Categories and allows us to group certain kinds of tests together and
 *  even include or exclude groups (categories). For example, we can separate slow tests from fast tests.
 *  To assign a test case or a method to one of those categories the @Category annotation is provided.
 *  First we have created two categories Fast and Slow.So we create two interface,and then apply these category to the test case present
 *  in Demo1 and Demo2.
 *  And we prepare a test suite for those test case and
 *  used the @IncludeCategory and @ExcludeCategory according to requirement  */

//@RunWith(Suite.class)
@RunWith(Categories.class)
@IncludeCategory(Slow.class)
@ExcludeCategory(Fast.class)
@SuiteClasses({ Demo1.class, Demo2.class })
public class AllTests {

}
