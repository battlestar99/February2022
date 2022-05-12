package sauceDemoTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemoPages.cart;
import sauceDemoPages.checkOutPageOne;
import sauceDemoPages.checkOutPageTwo;
import sauceDemoPages.loginPage;
import sauceDemoPages.productPage;

public class chekcoutEndtoEnd {
	
	WebDriver driver;
	loginPage lp; 
	productPage pp; 
	cart ca; 
	checkOutPageOne cop; 
	checkOutPageTwo copt; 
		
		@BeforeTest
		public void testsetup() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			lp = new loginPage(driver);
			pp = new productPage(driver);
			ca = new cart(driver);
			cop = new checkOutPageOne(driver);
			copt = new checkOutPageTwo(driver);
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			
		}
		
		@AfterTest
		public void endtest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
		}
		
		
		@Test
		public void checkOut() throws InterruptedException {
			
			
			Thread.sleep(2000);
			
			// entering valid user information
			
			lp.getUserName().sendKeys("standard_user");
			lp.getPassword().sendKeys("secret_sauce");
			lp.getloginButton().click();
			
			
			Thread.sleep(1000);
			
			// adding product to the inventory page
			
			pp.addBackpackToCart().click();
			pp.getCart().click();
			Thread.sleep(1000);
			// clicking the checkout in the cart page
			
			ca.getcheckOutButton().click();
			Thread.sleep(1000);
			// filling out info and confirming the checkout
			
			cop.getfirstName().sendKeys("Jon");
			cop.getlastName().sendKeys("oliver");
			cop.getzipCode().sendKeys("22031");
			cop.getContinueButton().click();
			Thread.sleep(1000);
			 // reviewing information and click for final checkout
			
			copt.getfinishButton().click();
			
			// validating the final checkout page
			Reporter.log("end to end checkout process for valid user");
			
			String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
			
			String actualUrl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualUrl, expectedUrl);
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	

}
