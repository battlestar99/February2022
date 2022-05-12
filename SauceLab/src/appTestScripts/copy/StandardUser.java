package appTestScripts.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appPages.LoginPage;



public class StandardUser {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void runBeforeTest() {
		driver.get("https://www.saucedemo.com/");
	}
	
	// pre-requirment 
	@BeforeTest
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb22-Workspace\\February2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}
	
	@Test(priority = 1)
	public void standardUserLogin() throws InterruptedException {
		lp.usernameTextbox().sendKeys("standard_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(3000);
//		driver.quit();
	}
	
	
}
