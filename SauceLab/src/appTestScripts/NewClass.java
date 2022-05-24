package appTestScripts;

import org.testng.annotations.Test;

public class NewClass {
	
	@Test(groups = {"smoke", "sanity"})
	public void testOne() {
		System.out.println("test one");
	}
	
	@Test(groups = "sanity")
	public void testTwo() {
		System.out.println("test two");

	}
	
	@Test(groups = "smoke")
	public void testThree() {
		System.out.println("test three");

	}
	
	@Test(groups = "sanity")
	public void testFour() {
		System.out.println("test four");

	}

}
