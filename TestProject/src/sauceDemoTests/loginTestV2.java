package sauceDemoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemoPages.loginPage;

public class loginTestV2 {
	
	
WebDriver driver;
loginPage lp; 
	
	@BeforeTest
	public void testsetup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new loginPage(driver);
		
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeMethod
	public void beforeEachTests() {
		
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=0)
	public void validLogin() throws InterruptedException {
		
		
		Thread.sleep(2000);
		
		// entering valid user information
		
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		Reporter.log("login test with valid credentials");
		
		// expected result : successful login 
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
	@Test(priority=1)
	public void invalidLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		
		// expected result : successful login 
		lp.getUserName().sendKeys("locked_out_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		Reporter.log("login test with invalid credentials");
		
		String expectedUrl = "https://www.saucedemo.comm/";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@AfterTest
	public void endtest() {
	
	driver.quit();
	
	}
	

}
