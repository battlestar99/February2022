package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {

	
WebDriver driver; 
	
	public productPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement addBackpackToCart() {
		
		WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		return x; 
			
	}
	
public WebElement getCart() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		return x; 
			
	}
	
}
