package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		/*
		 * id
		 * name
		 * class
		 * 
		 */
		
		//input[@type='submit']
		
		
//		WebElement usernameTextbox = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div/form/div/input"));
//		usernameTextbox.sendKeys("standard_user");
//		
//		WebElement passwordTextbox = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div/form/div[2]/input"));
//		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement signinButton = driver.findElement(By.xpath("//a[@id= 'nav-link-accountList']"));
		signinButton.click();
		

		
		//absolute xpath
		//relative xpath
		
		
//		driver.close();
		
		//https://www.saucedemo.com/
		//get, 
		//driver.manage().window().maximize();
		// driver.getCurrentUrl()
		//driver.getTitle()
		//close()
		//quit()
		// Thread.sleep(10000);
		
//		driver.close(); // close the current tab
//		driver.quit();	// close all the tab and window
		
	}

}
