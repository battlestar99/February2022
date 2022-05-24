package appTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appPages.LoginPage;

public class AllScript {
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void runBeforeTest() {
		driver.get("https://www.saucedemo.com/");
	}
	
	// pre-requirment 
	@BeforeSuite
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb22-Workspace\\February2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}
	
	@Test( groups = {"smoke"}, priority = 1)
	public void standardUserLogin() throws InterruptedException {
		lp.usernameTextbox().sendKeys("standard_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}
	
	@Test( groups = {"sanity"}, priority = 2)
	public void problemUserLogin() throws InterruptedException {
		lp.usernameTextbox().sendKeys("problem_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}
	
	@Test(priority = 3, groups = "regression")
	public void performanceGlitchUserLogin() throws InterruptedException {
		lp.usernameTextbox().sendKeys("performance_glitch_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}
	
	@Test(priority = 4, groups = "regression")
	public void lockedOutUserLogin() throws InterruptedException {
		lp.usernameTextbox().sendKeys("locked_out_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(3000);
//		driver.quit();
	}
}
