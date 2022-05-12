package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {

	
	WebDriver driver; 
	
	public signInPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	public WebElement getsignUpEmail() {
		
		WebElement x = driver.findElement(By.name("email_create"));
		
		return x; 
		
		
	}
	
	public WebElement getSignUpButton() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		return x; 
	}
	
	
	
	
}
