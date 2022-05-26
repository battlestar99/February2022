package appTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appPages.LoginPage;



public class StandardUser extends BasePage{
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void runBeforeTest() {
		driver.get("https://www.saucedemo.com/");
	}
	
	// pre-requirment 
	@BeforeTest
	public void setupDriver() {
		driver = setupTest();
		lp = new LoginPage(driver);
	}
	
//	@Parameters({"username", "password"})
	@Test(priority = 1)
	public void standardUserLogin(String name, String passwrd) throws InterruptedException {
		lp.usernameTextbox().sendKeys("stanss");
		lp.passwordTextbox().sendKeys("sajdfgkasg");
		lp.signinButton().click();
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(3000);
//		driver.quit();
	}
	
	
}
