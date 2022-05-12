package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void startTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void successfullloginTest() {
		
	WebElement username = driver.findElement(By.id("user-name"));
	WebElement password = driver.findElement(By.id("password"));	
	WebElement logInButton = driver.findElement(By.id("login-button"));	
	
	username.sendKeys("standard_user");
	password.sendKeys("secret_sauce");
	logInButton.click();
	
	// expected result : successful login 
	
	String expectedUrl = "https://www.saucedemo.com/inventory.html";
	String actualUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(actualUrl, expectedUrl);
	
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	

}
