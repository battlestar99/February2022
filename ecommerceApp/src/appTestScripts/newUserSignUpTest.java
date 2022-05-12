package appTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appPages.homePage;
import appPages.signInPage;
import appPages.signUpPage;

public class newUserSignUpTest {
	
	WebDriver driver;
	homePage hp; 
	signInPage sp; 
	signUpPage sup; 
	
	// pre-requirment 
	@BeforeTest
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb22-Workspace\\February2022\\chromedriver.exe");
		driver = new ChromeDriver();
		hp = new homePage(driver);
		sp = new signInPage(driver);
		sup = new signUpPage(driver);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void signupTest() throws InterruptedException {
		
		hp.getSignInLink().click();
		
		sp.getsignUpEmail().sendKeys("abcdef@test12.com");
		
		sp.getSignUpButton().click();;
		
		Thread.sleep(2000);
		boolean x = sup.getFirstName().isDisplayed();
		Thread.sleep(2000);
		
		Reporter.log("Signup Test for New User");
		Assert.assertTrue(x);
		
	}
	
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}
	
	
	
	
	

}
