package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement loginButton = driver.findElement(By.className("login"));
		loginButton.click();
	
		WebElement emailAddressTextbox = driver.findElement(By.id("email_create"));
		emailAddressTextbox.sendKeys("kjashgkjhk@gmail.com");
	
		WebElement createAnAccountButton = driver.findElement(By.name("SubmitCreate"));
		createAnAccountButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		
		
		WebElement titleGender = driver.findElement(By.id("id_gender1"));
		titleGender.click();
		
		
		
		WebElement dayDropdown = driver.findElement(By.id("days"));
		
		
		Select sel = new Select(dayDropdown);
		sel.selectByIndex(10);
		
		
		Thread.sleep(5000);
	}

}
