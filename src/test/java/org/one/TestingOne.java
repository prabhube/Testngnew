package org.one;

import org.testng.annotations.Test;

public class TestingOne {
	
	//@Test(dependsOnMethods="father")
	//@Test(priority=0)
	@Test(enabled=false)

	public void Name() {
		System.out.println("school");
	}
	//@Test(dependsOnMethods="Name")
	//@Test(priority=1)
	//@Test(enabled=false)
	public void prabhu() {
		System.out.println("collage");
	}
	@Test(invocationCount=4,timeOut=5000)
	public void father() {
		System.out.println("home");
	}
	@Test(enabled=false)
	//@Test(priority=2)
	private void sister() {
		System.out.println("park");
	}
	
}
