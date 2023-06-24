package org.one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	//@BeforeSuite
	//public void beforeSuite() {
	//	System.out.println("BeforeSuite");
	//}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Beforemethod");
	}
	@Test
	public void testOne() {
		System.out.println("TestOne");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AfterSuite");
	}
}
