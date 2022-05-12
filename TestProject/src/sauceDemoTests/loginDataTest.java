package sauceDemoTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import sauceDemoPages.loginPage;

public class loginDataTest {
	
	
	WebDriver driver;
	loginPage lp; 
		
		@BeforeTest
		public void testsetup() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb22-Workspace\\February2022\\chromedriver.exe");
			driver = new ChromeDriver();
			lp = new loginPage(driver);
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			
		}
		
		
		@Parameters({"username","password","expectedUrl"})
		@Test
		public void LoginTest(String username, String password, String expectedUrl) throws InterruptedException {
			
			
			Thread.sleep(2000);
			
			// entering valid user information
			
			lp.getUserName().sendKeys(username);
			lp.getPassword().sendKeys(password);
			lp.getloginButton().click();
			
			Reporter.log("login test with valid credentials");
			
			// expected result : successful login 
			
			
			String actualUrl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualUrl, expectedUrl);
			
			
		}
		
		
		@AfterTest
		public void endtest() {
		
		driver.quit();
		
		}
		

}
