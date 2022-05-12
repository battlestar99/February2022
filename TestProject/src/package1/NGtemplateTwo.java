package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NGtemplateTwo {
	
	
	// pre requirment of the test/s 
	
	@BeforeTest
	public void setupTest() {
		
		// setup browser, open browser, delete cookies
		//maximizing windows
		
		System.out.println("This is test setup");
	}
	
	// post requriement of the test/s 
	
	@AfterTest 
	public void endTest() {
		
	// close the browser 
		
		System.out.println("This is test end");
		
	}
	
	@Test(priority=0)
	public void validateCart() {
		
		System.out.println("validate cart");
		// write actual test steps
		// add pass/fail scenario
		
	}
	
	@Test(priority=1)
	public void validateCheckout() {
		
		System.out.println("validateCheckout");
		// write actual test steps
		// add pass/fail scenario
		
		
	}
	
	@BeforeMethod
	public void beforeeachTest() {
		
	// code 
		System.out.println("this is beforemetod");
		
	}
	
	
	@AfterMethod
	public void aftereachTest() {
		
	// code 
		System.out.println("this is AfterMethod");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
