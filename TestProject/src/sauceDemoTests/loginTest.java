package sauceDemoTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {
	
	WebDriver driver; 
	
	@BeforeTest
	public void testsetup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeMethod
	public void beforeEachTests() {
		
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=0)
	public void validLogin() throws InterruptedException {
		
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));	
		WebElement logInButton = driver.findElement(By.id("login-button"));	
		
		// entering valid user information
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		logInButton.click();
		
		// expected result : successful login 
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
	@Test(priority=1)
	public void invalidLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));	
		WebElement logInButton = driver.findElement(By.id("login-button"));	
		
		// entering invalid user information
		username.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
		logInButton.click();
		
		// expected result : successful login 
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@AfterTest
	public void endtest() {
	
	driver.quit();
	
	}
	
	
	
	
	

}
