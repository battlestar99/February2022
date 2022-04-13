package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemUser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		
//		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@id='user-name']"));
//		usernameTextbox.sendKeys("performance_glitch_user");
		lp.usernameTextbox().sendKeys("problem_user");
		
//		WebElement passwordTextbox = driver.findElement(By.xpath("//input[@data-test='password']"));
//		passwordTextbox.sendKeys("secret_sauce");
		lp.passwordTextbox().sendKeys("secret_sauce");
		
//		WebElement signinButton = driver.findElement(By.name("login-button"));
//		signinButton.click();
		lp.signinButton().click();
	}

}
