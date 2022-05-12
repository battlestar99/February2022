package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver; 
	
	public homePage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getSignInLink() {
		
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		return signin; 
		
		
		
	}

}
