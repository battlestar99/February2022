package package1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NGTemplate {
	
	@AfterTest
	public void endtest() {
		
		
		System.out.println("This is after test");
		
	}
	
	@BeforeTest
	public void startTest() {
		
		System.out.println("This is beforetest");
		
	}
	
	@Test(priority=1)
	public void validateLogin() {
		
		System.out.println("This is validate login test");
		
		Assert.assertEquals("abc", "ab");
		
	}
	
	@Test(priority=0)
	public void validateSignup() {
		
		System.out.println("This is validate signup test");
		
		boolean x = false; 
		Assert.assertTrue(x);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
