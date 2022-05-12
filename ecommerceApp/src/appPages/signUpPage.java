package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	WebDriver driver; 
	
	
	public signUpPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	public WebElement getFirstName() {
		
		WebElement x = driver.findElement(By.id("customer_firstname"));
		return x; 
	}

}
