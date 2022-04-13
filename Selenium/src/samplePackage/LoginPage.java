package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver Idriver;
	
	public LoginPage(WebDriver driver) {
		Idriver = driver;
	}
	
	
	public WebElement usernameTextbox() {
		WebElement usernameTextbox = Idriver.findElement(By.xpath("//input[@id='user-name']"));
		return usernameTextbox;
	}
	
	public WebElement passwordTextbox() {
		WebElement passwordTextbox = Idriver.findElement(By.xpath("//input[@data-test='password']"));
		return passwordTextbox;
	}
	
	public WebElement signinButton() {
		WebElement signinButton = Idriver.findElement(By.name("login-button"));
		return signinButton;
	}
}
